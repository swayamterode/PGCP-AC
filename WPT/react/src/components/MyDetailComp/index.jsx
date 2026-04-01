const MyDetailComp = ({ fname, lname, gender, city, country, id }) => {
  return (
    <div id={id}>
      <p>
        Name: {fname} {lname}
      </p>
      <p>, Gender: {gender}</p>
      <p>
        , City: {city}, Country: {country}
      </p>
    </div>
  );
};

export default MyDetailComp;
