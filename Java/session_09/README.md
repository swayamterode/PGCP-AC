# Session 09 — Stack

## Contents

- [Session 09 — Stack](#session-09--stack)
  - [Contents](#contents)
  - [Quick Notes](#quick-notes)
  - [Stack Overview](#stack-overview)
  - [GenericStackDemo — Typed Stack](#genericstackdemo--typed-stack)
  - [NonGenericStack — Mixed-Type Stack](#nongenericstack--mixed-type-stack)
  - [Arrays.asList() Demo](#arraysaslist-demo)

---

## Quick Notes

| Topic                | Crux                                                                                                                                          |
| -------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| **Stack Overview**   | LIFO structure from `java.util`; extends `Vector` — synchronized, resizable, supports `null`.                                                 |
| **GenericStackDemo** | `Stack<Integer>` — type-safe stack; uses `push`/`pop`/`peek`/`empty`/`search`; `pop()` throws `EmptyStackException` on empty stack.           |
| **NonGenericStack**  | `Stack<Object>` — accepts any type including `null`; no compile-time safety; casting required on retrieval.                                   |
| **Arrays.asList()**  | Converts array to a **fixed-size** list; `add`/`remove` throw `UnsupportedOperationException`; wrong-type `set` throws `ArrayStoreException`. |

---
