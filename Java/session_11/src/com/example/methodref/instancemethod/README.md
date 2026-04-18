# Method Reference — Instance Method Reference

Demonstrates using instance method references to build a multi-key `Comparator` for sorting a `TreeSet` of `Employee` objects.

---

## Files

### [`Employee.java`](Employee.java)

A model class representing an employee with three fields.

| Field | Type | Description |
|---|---|---|
| `id` | `int` | Unique employee identifier |
| `empName` | `String` | Employee's full name |
| `salary` | `float` | Employee's salary |

Includes a full constructor, getters, a setter for `salary`, and a `toString()` override that formats as `name | id: [id]`.

---

### [`InstanceMethodDemo.java`](InstanceMethodDemo.java)

Builds a `TreeSet<Employee>` sorted first by name, then by ID, using instance method references.

**Key Concepts**

| Concept | Description |
|---|---|
| `Comparator.comparing()` | Creates a `Comparator` from a key extractor function |
| `.thenComparing()` | Chains a secondary sort criterion |
| `Employee::getEmpName` | Instance method reference used as a `Function<Employee, String>` key extractor |
| `Employee::getId` | Instance method reference used as a `Function<Employee, Integer>` key extractor |
| `TreeSet` | Maintains elements in sorted order using the provided `Comparator` |

---

## Sample Output

```
[Abhi | id: [33], Jay | id: [44], Jay | id: [55], Ram | id: [11], Swayam | id: [22]]
```

> Employees are sorted alphabetically by name; employees sharing the same name are ordered by ID.

---

## How to Run

```bash
javac com/example/methodref/instancemethod/Employee.java \
      com/example/methodref/instancemethod/InstanceMethodDemo.java
java com.example.methodref.instancemethod.InstanceMethodDemo
```
