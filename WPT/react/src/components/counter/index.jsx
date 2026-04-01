import { Component } from "react";

class Counter extends Component {
  constructor(props) {
    super(props);

    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  decrement = () => {
    this.setState((prevState) => ({
      count: prevState.count > 0 ? prevState.count - 1 : 0,
    }));
  };

  reset = () => {
    this.setState({ count: 0 });
  };

  render() {
    return (
      <div style={{ textAlign: "center", padding: "50px" }}>
        <h1>Counter: {this.state.count}</h1>

        <button onClick={this.increment}>+</button>
        <button onClick={this.decrement} style={{ margin: "0 10px" }}>
          -
        </button>
        <button onClick={this.reset}>Reset</button>
      </div>
    );
  }
}

export default Counter;
