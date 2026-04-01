import React, { useState } from "react";

const Clock = () => {
  const [hours, setHours] = useState(0);
  const [minutes, setMinutes] = useState(0);
  const [seconds, setSeconds] = useState(0);

  const incrementHours = () => {
    setHours((prevHours) => (prevHours + 1) % 24);
  };

  const incrementMinutes = () => {
    setMinutes((prevMinutes) => (prevMinutes + 1) % 60);
  };

  const incrementSeconds = () => {
    setSeconds((prevSeconds) => (prevSeconds + 1) % 60);
  };
  const reset = () => {
    setHours(0);
    setMinutes(0);
    setSeconds(0);
  };
  return (
    <div style={{ marginTop: "20px", display: "flex", flexDirection: "column", alignItems: "center", gap: "10px" }}>
      <h1>{`${hours.toString().padStart(2, "0")}:${minutes.toString().padStart(2, "0")}:${seconds.toString().padStart(2, "0")}`}</h1>
      <div style={{ display: "flex", gap: "10px" }}>
        <button onClick={incrementHours}>Increment Hours</button>
        <button onClick={incrementMinutes}>Increment Minutes</button>
        <button onClick={incrementSeconds}>Increment Seconds</button>
        <button onClick={reset}>Reset</button>
      </div>
    </div>
  );
};

export default Clock;
