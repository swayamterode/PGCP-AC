# Session 08 — Serialization, Deserialization, and ArrayList

## Contents

- [Session 08 — Serialization, Deserialization, and ArrayList](#session-08--serialization-deserialization-and-arraylist)
  - [Contents](#contents)
  - [Serialization Overview](#serialization-overview)
  - [The Serializable Class](#the-serializable-class)
  - [Serialization — Writing to File](#serialization--writing-to-file)
  - [Deserialization — Reading from File](#deserialization--reading-from-file)
  - [ArrayList](#arraylist)

---

## Serialization Overview

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

---

## ArrayList

[ArrayListDemo.java](src/session_08/classroom/arraylist/ArrayListDemo.java)

> A resizable array from `java.util` that can hold mixed types when declared as `ArrayList<Object>`.

```java
ArrayList<Object> arr = new ArrayList<>();
arr.add(10);
arr.add("Swayam");
arr.add(10.25f);
// [10, Swayam, 10.25]

arr.add(1, "B");         // insert at index 1
arr.get(3);              // retrieve element at index 3
```

- `add(val)` — appends to the end
- `add(index, val)` — inserts at a specific index, shifts the rest
- `get(index)` — retrieves element at that position
- `addAll(other)` — copies all elements from another list into this one

```java
ArrayList<Object> a1 = new ArrayList<>();
a1.add(100);
a1.addAll(arr);   // a1 now has 100 + everything in arr

for (Object itr : a1) {
    System.out.println(itr);  // iterate with for-each
}
```
