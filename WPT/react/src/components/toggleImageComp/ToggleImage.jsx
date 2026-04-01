import { useState } from "react";
import constants from "../../shared/constant";
const ToggleImage = () => {
  const [, setIsToggled] = useState(false);
  const [currentImage, setCurrentImage] = useState(constants.fighterCat);
  const [imgName, setImgName] = useState("Fighter Cat");
  const handleToggleImage = () => {
    setIsToggled((prev) => !prev);
    setCurrentImage((prev) => (prev === constants.fighterCat ? constants.catCoke : constants.fighterCat));
    setImgName((prev) => (prev === "Fighter Cat" ? "Cat Coke" : "Fighter Cat"));
  };
  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        justifyContent: "center",
        alignItems: "center",
      }}
    >
      <h1>Image Toggle</h1>
      <img
        src={currentImage}
        alt="Toggle Image"
        style={{
          borderRadius: "40px",
          width: "300px",
        }}
      />
      <span>{imgName}</span>
      <button
        type="button"
        onClick={handleToggleImage}
        style={{
          padding: "10px 20px",
          fontSize: "16px",
          cursor: "pointer",
          borderRadius: "20px",
        }}
      >
        Toggle Image
      </button>
    </div>
  );
};

export default ToggleImage;
