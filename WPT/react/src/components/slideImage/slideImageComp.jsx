import { useState } from "react";
import constants from "../../shared/constant";
const SlideImageComp = () => {
  const [images, setImages] = useState([constants.fighterCat, constants.catCoke, constants.catCry, constants.catSmiled]);
  const handlePreviousImage = () => {
    setImages((prevImages) => {
      const lastImage = prevImages[prevImages.length - 1];
      const remainingImages = prevImages.slice(0, prevImages.length - 1);
      return [lastImage, ...remainingImages];
    });
  };
  const handleNextImage = () => {
    setImages((prevImages) => {
      const [firstImage, ...remainingImages] = prevImages;
      return [...remainingImages, firstImage];
    });
  };
  return (
    <div style={{ display: "flex", flexDirection: "column", alignItems: "center", marginBottom: "20px" }}>
      <h1>Image Slide</h1>

      <img
        src={images[0]}
        alt="Fighter Cat"
        style={{
          width: "300px",
          borderRadius: "30px",
        }}
      />
      <div
        style={{
          display: "flex",
          gap: "10px",
          marginTop: "20px",
        }}
      >
        <button onClick={handleNextImage}>Next</button>
        <button onClick={handlePreviousImage}>Previous</button>
      </div>
    </div>
  );
};

export default SlideImageComp;
