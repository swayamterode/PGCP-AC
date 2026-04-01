import React, { Component } from "react";
import constants from "../../shared/constant";

class ToggleImage extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isToggled: false,
      currentImage: constants.fighterCat,
      imgName: "Fighter Cat",
    };
  }

  handleToggleImage = () => {
    this.setState((prevState) => ({
      isToggled: !prevState.isToggled,
      currentImage: prevState.currentImage === constants.fighterCat ? constants.catCoke : constants.fighterCat,
      imgName: prevState.imgName === "Fighter Cat" ? "Cat Coke" : "Fighter Cat",
    }));
  };

  render() {
    const { currentImage, imgName } = this.state;

    return (
      <div
        style={{
          display: "flex",
          flexDirection: "column",
          justifyContent: "center",
          alignItems: "center",
          height: "100vh",
        }}
      >
        <img
          src={currentImage}
          alt="Toggle Image"
          style={{
            borderRadius: "40px",
          }}
        />
        <span>{imgName}</span>
        <button
          type="button"
          onClick={this.handleToggleImage}
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
  }
}

export default ToggleImage;
