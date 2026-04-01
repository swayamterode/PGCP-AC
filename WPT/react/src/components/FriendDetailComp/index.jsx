import { Component } from "react";
import "./FriendDetailComp.css";

class FriendDetailComp extends Component {
  render() {
    const { fname, lname, gender, city, country } = this.props;

    return (
      <div className="card">
        <h2>Friend Details</h2>
        <p>
          <strong>First Name:</strong> {fname}
        </p>
        <p>
          <strong>Last Name:</strong> {lname}
        </p>
        <p>
          <strong>Gender:</strong> {gender}
        </p>
        <p>
          <strong>City:</strong> {city}
        </p>
        <p>
          <strong>Country:</strong> {country}
        </p>
      </div>
    );
  }
}

export default FriendDetailComp;
