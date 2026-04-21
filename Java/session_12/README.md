# Session 12 — Streams API & Functional Data Processing

> Covers Java Streams API for functional-style operations on collections, including filtering, mapping, aggregation, and terminal operations with practical `Employee` data examples.

**Path:** `src/session_12/com/example/javaapi/`

---

## Files

| #   | File                                                                                              | Description                                                                                        | Level        |
| --- | ------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | ------------ |
| 1   | [Employee.java](src/session_12/com/example/javaapi/Employee.java)                                | POJO with `empId`, `empName`, and `empSal` fields; getters, setters, and `toString`                | Beginner     |
| 2   | [BasicOperations.java](src/session_12/com/example/javaapi/BasicOperations.java)                  | Stream creation, `IntStream.of()`, `rangeClosed()`, `range()`; chained `filter→map→reduce`         | Elementary   |
| 3   | [SalaryGreaterThan.java](src/session_12/com/example/javaapi/SalaryGreaterThan.java)               | `filter()` + `collect()` with `Collectors.toMap()`; salary filtering using method references       | Intermediate |
| 4   | [Test.java](src/session_12/com/example/javaapi/Test.java)                                        | Comprehensive demo: `count()`, `filter()`, `map()`, `sorted()`, `min()`, `reduce()`, `Optional<T>` | Intermediate |

---

## Concepts Covered

### Stream Creation
- `collection.stream()` — stream from a `List`
- `IntStream.of()` — primitive stream from discrete values
- `IntStream.range(start, end)` — exclusive upper bound
- `IntStream.rangeClosed(start, end)` — inclusive upper bound

### Intermediate Operations
| Operation  | Description                                          |
| ---------- | ---------------------------------------------------- |
| `filter()` | Keeps elements matching a `Predicate`                |
| `map()`    | Transforms each element (e.g., `Employee` → `String`) |
| `sorted()` | Custom ordering with `Comparator.comparing()`        |

### Terminal Operations
| Operation    | Description                                             |
| ------------ | ------------------------------------------------------- |
| `forEach()`  | Iterates using a `Consumer` or method reference         |
| `collect()`  | Gathers results into `List`, `Set`, or `Map`            |
| `count()`    | Returns the number of elements as `long`                |
| `sum()`      | Aggregates numeric stream values                        |
| `min()`      | Finds the minimum element; returns `Optional<T>`        |
| `reduce()`   | Custom aggregation with an accumulator (e.g., `Long::sum`) |

### Collectors
- `Collectors.toList()` — mutable `List`
- `Collectors.toSet()` — de-duplicated `Set`
- `Collectors.toMap(keyMapper, valueMapper)` — key-value `Map`

### Optional\<T\>
A null-safe container returned by operations like `min()` and `max()`.  
Use `.get()` to unwrap or `.isPresent()` to check before accessing.

### Method References
- `System.out::println` — instance method reference
- `Employee::getEmpName`, `Employee::getEmpSal` — instance method on type
- `Long::sum` — static method reference used as accumulator
