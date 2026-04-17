# asList() Demo

## File

- [ArrayAsListDemo.java](ArrayAsListDemo.java)

## Overview

Demonstrates the use of `Arrays.asList()` to convert an array into a fixed-size `List` backed by the original array.

## Code Walkthrough

### Array Initialization

```java
Character ch[] = { 'a', 'e', 'i', 'o', 'u' };
```

A `Character` array holding the five English vowels.

### Converting Array to List

```java
List<Object> charList = Arrays.asList((Object[]) ch);
```

- `Arrays.asList()` wraps the array in a **fixed-size** `List`.
- The array is cast to `Object[]` so each `Character` element is treated as an individual `Object`.
- The returned list is **backed by the original array** — changes to one are reflected in the other.

### Printing the List

```java
System.out.println(charList);
// Output: [a, e, i, o, u]
```

### Iterating with forEach

```java
charList.forEach(x -> { System.out.print(x); });
// Output: aeiou
```

Uses a lambda expression to print each element without a newline.

---

## Commented-Out Operations and Why They Fail

| Operation | Exception | Reason |
|---|---|---|
| `charList.set(1, "z")` | `ArrayStoreException` | The list is backed by a `Character[]`. Storing a `String` violates the array's type. |
| `charList.add('e')` | `UnsupportedOperationException` | `Arrays.asList()` returns a **fixed-size** list; adding elements is not allowed. |
| `charList.remove(0)` | `UnsupportedOperationException` | Same reason — the list size is fixed and cannot shrink. |

## Key Takeaway

`Arrays.asList()` creates a **fixed-size, array-backed list**:
- Structural modifications (`add`, `remove`) are **not supported**.
- Element replacement via `set()` is allowed only if the new value is type-compatible with the underlying array.
- To get a fully mutable list, wrap it: `new ArrayList<>(Arrays.asList(...))`.
