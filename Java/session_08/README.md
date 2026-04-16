# Session 08 — Serialization

## What is Serialization?

> Converting a Java object into a **byte stream** so it can be saved to a file, sent over a network, or stored in a database — and later reconstructed exactly as it was.

```
Java Object  ──serialize──▶  byte stream  ──▶  file / network / DB
Java Object  ◀──deserialize──  byte stream  ◀──  file / network / DB
```

The reverse process — rebuilding the object from bytes — is called **Deserialization**.

---

## The `Serializable` Interface

To make a class serializable, implement `java.io.Serializable`.

```java
import java.io.Serializable;

public class SeralizationDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    // ...
}
```

- `Serializable` is a **marker interface** — it has no methods. Its presence just signals to the JVM that this class is safe to serialize.
- Every field of the class is serialized automatically, including nested objects (as long as they are also `Serializable`).

---

## `serialVersionUID`

```java
private static final long serialVersionUID = 1L;
```

- A unique ID that ties a serialized byte stream to a specific version of the class.
- When you deserialize, Java checks that the `serialVersionUID` in the file matches the class currently loaded.
- If they don't match → `InvalidClassException` is thrown.
- Always declare it explicitly; letting the JVM auto-generate it causes problems when the class changes.

---

## Writing an Object — Serialization

Uses `ObjectOutputStream` wrapped around a `FileOutputStream`.

```java
// Test.java
SeralizationDemo emp = new SeralizationDemo("Swayam", 24);

try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
    oos.writeObject(emp);
} catch (IOException e) {
    System.out.println(e.getMessage());
}
```

- `writeObject(obj)` converts the object to bytes and writes it to `employee.ser`.
- The **try-with-resources** block ensures the stream is closed automatically.

---

## Reading an Object — Deserialization

Uses `ObjectInputStream` wrapped around a `FileInputStream`.

```java
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
    SeralizationDemo emp = (SeralizationDemo) ois.readObject();
    System.out.println(emp); // [age= 24, name= Swayam]
} catch (IOException | ClassNotFoundException e) {
    System.out.println(e.getMessage());
}
```

- `readObject()` returns `Object`, so you must **cast** it to the correct type.
- The constructor is **not called** during deserialization — fields are restored directly from bytes.

---

## The `transient` Keyword

Fields marked `transient` are **skipped** during serialization — they are not saved to the file.

```java
private transient String password; // will NOT be serialized
```

Use it for sensitive data, derived values, or fields that can't be serialized (e.g., `Thread`, database connections).

---

## Key Classes at a Glance

| Class | Package | Purpose |
|---|---|---|
| `Serializable` | `java.io` | Marker interface — enables serialization |
| `ObjectOutputStream` | `java.io` | Writes objects to a stream (serialize) |
| `ObjectInputStream` | `java.io` | Reads objects from a stream (deserialize) |
| `FileOutputStream` | `java.io` | Writes raw bytes to a file |
| `FileInputStream` | `java.io` | Reads raw bytes from a file |

---

## Files

| File | Description |
|---|---|
| [SeralizationDemo.java](src/session_08/classroom/seralization/SeralizationDemo.java) | The serializable `Employee`-like class with `name` and `age` |
| [Test.java](src/session_08/classroom/seralization/Test.java) | Serializes an object and writes it to `employee.ser` |
| [employee.ser](employee.ser) | The binary output file produced by serialization |

---

## Common Pitfalls

| Mistake | Result |
|---|---|
| Class doesn't implement `Serializable` | `NotSerializableException` at runtime |
| A field's type is not `Serializable` | Same exception — the whole graph must be serializable |
| Changing the class without updating `serialVersionUID` | `InvalidClassException` when deserializing old files |
| Forgetting to cast the result of `readObject()` | `ClassCastException` |
