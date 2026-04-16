# Session 08 — Serialization

> Converting a Java object into a **byte stream** so it can be saved to a file, and later reconstructed exactly as it was.

```
Object  ──serialize──▶  .ser file
Object  ◀──deserialize──  .ser file
```

---

## The Serializable Class

[SerializationInterface.java](src/session_08/classroom/serialization/SerializationInterface.java)

```java
public class SerializationInterface implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
}
```

- `Serializable` is a **marker interface** — no methods, just signals the JVM this class can be serialized.
- `serialVersionUID` links the byte stream to a specific version of the class. If the class changes and the ID doesn't match → `InvalidClassException`.

---

## Serialization — Writing to File

[SerializationDemo.java](src/session_08/classroom/serialization/SerializationDemo.java)

```java
SerializationInterface emp = new SerializationInterface("Swayam", 24);

try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
    oos.writeObject(emp);
} catch (IOException e) {
    System.out.println(e.getMessage());
}
```

- `writeObject()` converts the object to bytes and writes it to `employee.ser`.
- Try-with-resources closes the stream automatically.

---

## Deserialization — Reading from File

[DeserializeDemo.java](src/session_08/classroom/serialization/DeserializeDemo.java)

```java
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
    SerializationInterface emp = (SerializationInterface) ois.readObject();
    System.out.println(emp); // [age= 24, name= Swayam]
} catch (IOException e) {
    System.out.println(e.getMessage());
}
```

- `readObject()` returns `Object` — cast it to the correct type.
- `ClassNotFoundException` is declared via `throws` on the method since the class must be on the classpath.
- The **constructor is not called** — fields are restored directly from bytes.
