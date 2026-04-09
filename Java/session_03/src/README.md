# LearningStatic — Static Concepts

## Static Variable

```java
private static int count;
```

- Shared across **all objects** of the class — only one copy exists
- Incremented in both constructors via `count++`

---

## Static Block

```java
static {
    System.out.println("Static Block Called!");
    count = 10;
}
```

- Runs **once**, automatically, when the cl
- ass is loaded into memory
- Executes **before** `main()` and before any object is created
- Used here to initialize `count` to `10`

---

## Static Method

```java
public static void getCount() {
    System.out.println("Count: " + count);
}
```

- Belongs to the **class**, not to any object
- Called as `LearningStatic.getCount()` — no object needed
- Can only access static variables directly

---

## Execution Order

1. Static block runs → prints `Static Block Called!`, sets `count = 10`
2. `main()` starts
3. Each `new LearningStatic(...)` increments `count` by 1
