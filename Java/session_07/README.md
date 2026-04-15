# Session 07 — Inner Classes, Lambdas & String Methods

## Inner Classes

> A class defined inside another class. Used to logically group code that belongs together.

| Type | File | Key Point |
|---|---|---|
| Member | [MemberInnerClassDemo.java](src/session_07/MemberInnerClassDemo.java) | Lives inside outer class, can access its private fields |
| Method-Local | [MemberLocalInnerClassDemo.java](src/session_07/MemberLocalInnerClassDemo.java) | Defined inside a method, only lives there |
| Static | [StaticInnerClassDemo.java](src/session_07/StaticInnerClassDemo.java) | No outer instance needed, only sees `static` fields |
| Anonymous | [AnonymousInnerClassDemo.java](src/session_07/AnonymousInnerClassDemo.java) | Implement an interface inline, no class name needed |
| Practice | [PracticeMethodLocalInnerClass.java](src/session_07/PracticeMethodLocalInnerClass.java) | Access outer field via `OuterClass.this.field` |

---

## Lambda Expressions

> A shorter way to implement a `@FunctionalInterface` (interface with exactly one method).

```java
// Old way
HelloWorldInterface obj = new HelloWorldClass();

// Lambda way
HelloWorldInterface obj = () -> "Hello Java!";
```

| File | Description |
|---|---|
| [HelloWorldInterface.java](src/session_07/lambda/HelloWorldInterface.java) | The `@FunctionalInterface` |
| [HelloWorldLambda.java](src/session_07/lambda/HelloWorldLambda.java) | Lambda in action |
| [IncrementByTenInterface.java](src/session_07/lambda/IncrementByTenInterface.java) | Interface with a parameter |
| [IncerementByTenClass.java](src/session_07/lambda/IncerementByTenClass.java) | `(a) -> a + 10` |

---

## String Methods

> Common `String` operations every Java developer uses daily.

[StringMethods.java](src/session_07/StringMethods.java)

| Method | What it does | Example |
|---|---|---|
| `equals()` | Exact match (case-sensitive) | `"Hi".equals("hi")` → `false` |
| `equalsIgnoreCase()` | Match ignoring case | `"Hi".equalsIgnoreCase("hi")` → `true` |
| `compareTo()` | Alphabetical order check | Returns `0` if equal, `<0` or `>0` otherwise |
| `trim()` | Removes leading/trailing spaces | `"  hi  ".trim()` → `"hi"` |
| `charAt(i)` | Get char at index | `"Java".charAt(0)` → `'J'` |
| `toCharArray()` | String → char array | `"Hi"` → `['H','i']` |
| `startsWith()` / `endsWith()` | Prefix/suffix check | `"https://...".startsWith("https")` → `true` |
