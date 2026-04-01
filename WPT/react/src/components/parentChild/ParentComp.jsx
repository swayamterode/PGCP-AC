import React, { Component } from "react";
import ChildComp from "./childComp";

class ParentComp extends Component {
  constructor(props) {
    super(props);

    this.state = {
      emp: "Swayam Terode",
      empSal: 90000,
    };

    this.onChangeEmpData = this.onChangeEmpData.bind(this);
  }

  onChangeEmpData() {
    this.setState((prevData) => ({
      emp: "Swayam Terode Updated Salary",
      empSal: prevData.empSal + 500,
    }));
  }

  render() {
    return <ChildComp onClick={this.onChangeEmpData} emp={this.state.emp} empSal={this.state.empSal} myAction={this.onChangeEmpData} />;
  }
}

export default ParentComp;
