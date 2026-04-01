# React Notes

**Date:** 31/03/2024

---

## What is React?

React is a JavaScript library used to create rich User Interfaces (UI). Key points:

- Creates **Single Page Applications (SPA)**
- Works on a **component-based** architecture
- Developed and maintained by **Facebook**
- Latest version: **React 19**

---

## Technology Requirements

- HTML, CSS, JavaScript (ES5, ES6, OOPs)

## Software Prerequisites

- Node.js
- npm
- CRA (Create React App)
- IDE (VS Code recommended)

---

## How to Create a React Project

### 1. Using `npx` (No global install needed)

```bash
npx create-react-app appname
cd appname
npm start
```

### 2. Using `npm` (Requires global install)

```bash
npm install -g create-react-app
create-react-app appname
cd appname
npm start
```

### 3. Using Vite (Minimal file size)

Vite creates a React project with minimum file size and faster build times.

---

## Components

A **component** is a partial/reusable part of a React application.

- Can represent any part of the UI
- Written once, used in multiple places
- File names must start with a **capital letter**

> React has only **one HTML file** — `index.html`  
> The **root component** is `App.js`

### Types of Components

| Type                   | When to Use                            |
| ---------------------- | -------------------------------------- |
| **Function Component** | When the main focus is UI design       |
| **Class Component**    | When complex logic needs to be written |

### Displaying Component Output

Import the component and use it as a JSX tag:

```jsx
import MyComponent from "./MyComponent";

function App() {
  return <MyComponent />;
}
```

---

## JSX (JavaScript XML)

- Allows writing HTML inside React components
- Makes component code easier to read and write
- Multiple elements must be wrapped in **one parent block element** (e.g., `<div>`, `<p>`)

---

## Props

Props are parameters used to pass data into a component.

- Return **object type** data
- Access in function component: `props.keyname`
- Access in class component: `this.props.keyname`

---

## State

State is used to handle essential/dynamic data in a **class component**.

- Returns **object type** data
- Defined inside the `constructor`
- Access outside state: `this.state.keyname`
- From **React v16+**, state can also be used in function components via the `useState` Hook

### `setState`

`setState()` is a built-in React method used to manipulate/update state data inside a class component.

---

## Conditional Rendering

Display component views based on conditions:

| Method                   | Description                                                    |
| ------------------------ | -------------------------------------------------------------- |
| **if/else**              | Executes if block when true, else block otherwise              |
| **Element as variable**  | Store result in a variable, display inside an element          |
| **Ternary operator**     | Shorthand: `(condition) ? truepart : falsepart`                |
| **Short-circuit (`&&`)** | Renders view only if condition is true; useful for null checks |

---

## Render

The `render()` method displays the component output on the browser.

---

## Practice Tasks

**Task 1:** Create a **function component** named `MyDetailComp`. Pass props: `fname`, `lname`, `gender`, `city`, `country` and display the output.

**Task 2:** Create a **class component** named `FriendDetailComp`. Pass props: `fname`, `lname`, `gender`, `city`, `country` and display the output.

**Task 3:** Create a **class component** named `CounterComp` with a state property `counter`. Add three buttons to **Increment**, **Decrement**, and **Reset** the counter value.
