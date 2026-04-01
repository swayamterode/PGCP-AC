const childComp = (props) => {
  const { emp, empSal, onClick, myAction } = props;

  return (
    <div style={{ padding: "10px", margin: "10px", borderRadius: "10px", display: "flex", flexDirection: "column", alignItems: "center"}}>
      <div style={{ color: "blue", fontSize: "20px" }}>
        Employee: {emp} — Salary: {empSal}
      </div>
      <button type="button" onClick={onClick}>
        Change Employee
      </button>
      <h2 onMouseOver={myAction} style={{ cursor: "pointer" }}>
        On hover change emp!
      </h2>
    </div>
  );
};

export default childComp;
