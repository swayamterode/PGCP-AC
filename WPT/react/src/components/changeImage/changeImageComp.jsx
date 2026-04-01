import { useState } from "react";
import constants from "../../shared/constant";
const ChangeImageComp = () => {
  const [currentImage, setCurrentImage] = useState(constants.fighterCat);
  return (
    <div style={{ display: "flex", flexDirection: "column", alignItems: "center" }}>
      <h1>Image Change</h1>

      <img src={currentImage} alt="Image" style={{ width: "300px", height: "300px", borderRadius: "30px" }} />
      <div style={{ marginTop: "20px", display: "flex", gap: "10px" }}>
        <button
          onClick={() => {
            setCurrentImage(constants.catCoke);
          }}
        >
          Coke Cat
        </button>
        <button
          onClick={() => {
            setCurrentImage(constants.catCry);
          }}
        >
          Cry Cat
        </button>
        <button
          onClick={() => {
            setCurrentImage(constants.catSmiled);
          }}
        >
          Smiling Cat
        </button>
        <button
          onClick={() => {
            setCurrentImage(constants.fighterCat);
          }}
        >
          Reset
        </button>
      </div>
    </div>
  );
};

export default ChangeImageComp;
