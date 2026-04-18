# Comparable vs Comparator in Java

> Two ways to sort custom objects — know when to use which.

---

## The Core Idea

| | `Comparable` | `Comparator` |
|---|---|---|
| **Package** | `java.lang` | `java.util` |
| **Method** | `compareTo(T obj)` | `compare(T o1, T o2)` |
| **Where it lives** | Inside the class itself | Separate class (external) |
| **Sorting style** | Natural / default ordering | Custom / pluggable ordering |
| **Works with** | `TreeSet`, `TreeMap` auto-sort | `Collections.sort()`, `Arrays.sort()` |
| **Modify source?** | Yes — you implement it in your class | No — works on classes you don't own |

---

## Project Structure

```
comparable/
├── arraylist/          ← Comparator demo (external sorting)
│   ├── Employee.java
│   ├── MyComparator.java
│   └── Test.java
│
└── treeset/            ← Comparable demo (natural ordering)
    ├── Employee.java
    ├── EmployeeComparable.java
    └── Test.java
```

---

## Part 1 — `Comparator` with `ArrayList`

### `Employee.java`

A plain POJO with three fields.

```java
public class Employee {
    private int empId;
    private String empname;
    private double empSalary;
    // constructor, getters, setters, toString
}
```

Nothing special here. Employee has **no sorting logic** — that's the whole point of `Comparator`. The class stays clean.

---

### `MyComparator.java` — the sorting brain

```java
public class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getEmpId() > e2.getEmpId()) return +1;   // e1 goes after e2
        else if (e1.getEmpId() < e2.getEmpId()) return -1; // e1 goes before e2
        else return 0;                                    // equal
    }
}
```

**Return value rules for `compare(e1, e2)`:**

| Return | Meaning |
|--------|---------|
| `negative` | e1 comes **before** e2 |
| `0` | e1 and e2 are **equal** |
| `positive` | e1 comes **after** e2 |

This comparator sorts employees by `empId` in **ascending order**.

---

### `Test.java` — wiring it together

```java
ArrayList<Employee> t = new ArrayList<Employee>();
t.add(e1);  // empId = 22
t.add(e2);  // empId = 11
t.add(e3);  // empId = 33
t.add(e4);  // empId = 44

Collections.sort(t, new MyComparator());
System.out.println(t);
```

**Output:**
```
[Employee [empId=11, ...], Employee [empId=22, ...], Employee [empId=33, ...], Employee [empId=44, ...]]
```

> `ArrayList` does NOT sort automatically — you must call `Collections.sort()` and pass your `Comparator`.

---

## Part 2 — `Comparable` with `TreeSet`

### `Employee.java`

Same POJO as before — base class with no sorting logic.

---

### `EmployeeComparable.java` — sorting baked into the class

```java
public class EmployeeComparable extends Employee implements Comparable<EmployeeComparable> {

    @Override
    public int compareTo(EmployeeComparable e) {
        if (this.getEmpId() > e.getEmpId()) return -1;  // higher id → comes first
        else if (this.getEmpId() < e.getEmpId()) return +1;
        else return 0;
    }
}
```

**Return value rules for `compareTo(other)`:**

| Return | Meaning |
|--------|---------|
| `negative` | `this` comes **before** `other` |
| `0` | equal |
| `positive` | `this` comes **after** `other` |

Notice the return values are **flipped** compared to Part 1 — this gives **descending order** by `empId`.

---

### `Test.java` — no sort call needed

```java
TreeSet<EmployeeComparable> t = new TreeSet<EmployeeComparable>();
t.add(e1);  // empId = 22
t.add(e2);  // empId = 11
t.add(e3);  // empId = 33
t.add(e4);  // empId = 44

System.out.println(t);
```

**Output:**
```
[Employee [empId=44, ...], Employee [empId=33, ...], Employee [empId=22, ...], Employee [empId=11, ...]]
```

> `TreeSet` calls `compareTo()` automatically on every `add()`. No manual sort needed.

---

## Ascending vs Descending — The Trick

Both comparators sort by `empId`, but the return values are opposite:

```
Ascending  (MyComparator)     →  return +1 when e1 > e2
Descending (EmployeeComparable) →  return -1 when this > other
```

Flip the signs, flip the order. That's it.

---

## When to Use What

**Use `Comparable` when:**
- The class has one obvious natural sort order (e.g., employees by ID)
- You own and can modify the class
- You want `TreeSet`/`TreeMap` to auto-sort without extra setup

**Use `Comparator` when:**
- You need multiple sort strategies (by name, by salary, by ID)
- You don't own the class (e.g., sorting a library class)
- You want to keep sorting logic separate and swappable

---

## Quick Reference

```java
// Comparator — pass it in
Collections.sort(list, new MyComparator());

// Comparable — nothing to pass, class handles it
TreeSet<EmployeeComparable> set = new TreeSet<>();
set.add(emp); // auto-sorted via compareTo()
```
