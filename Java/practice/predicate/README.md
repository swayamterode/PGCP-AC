# Java Predicates – Practice Questions

A set of exercises to practice using `Predicate` and predicate
chaining in Java.

---

## Question 1 — Easy

**Scenario:** A bank maintains a list of customer accounts.  
 Each account has an account number, holder name, and current
balance.

**Task:** Using a `Predicate`, filter out all accounts where  
 the balance has fallen below zero. Print the account numbers of
all such overdrawn accounts.

---

## Question 2 — Easy

**Scenario:** A hospital stores patient records. Each record  
 contains the patient's name, age, and whether they have been
discharged.

**Task:** Using a `Predicate`, identify all patients who are
still admitted (not yet discharged) and are above the age of 60. Print their names.

---

## Question 3 — Easy

**Scenario:** An HR system stores employee records. Each  
 employee has a name, department, and a boolean flag indicating
if they are currently active.

**Task:** Using a `Predicate`, find all employees who belong to
the `Finance` department and are active. Print their names.

---

## Question 4 — Medium

**Scenario:** A university manages student enrollment. Each  
 student has a name, GPA (`double`), credit hours completed
(`int`), and a boolean for whether they are on academic  
 probation.

**Task:** Using a combination of `Predicate`s (and/or  
 chaining), find students eligible for the Dean's List. A
student qualifies if:

- GPA is **3.7 or above**, AND
- Credit hours completed **exceed 60**, AND
- They are **NOT** on academic probation

Print the qualifying students' names.

---

## Question 5 — Medium

**Scenario:** An e-commerce platform tracks orders. Each order
has an order ID, customer name, total amount (`double`),
payment status (`String`: `PAID`, `PENDING`, `FAILED`), and a  
 boolean indicating if the order has been shipped.

**Task:** Using chained `Predicate`s, identify orders that
require immediate attention. An order requires attention if:

- Payment status is `FAILED`, **OR**
- Payment status is `PAID` **but** the order has **NOT** been
  shipped **AND** the total amount **exceeds 5000.0**

Print the order IDs of such orders.
