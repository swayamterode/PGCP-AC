import { Component } from "react";
import constants from "../../shared/constant";
class MyImagesComp extends Component {
  render() {
    return (
      <div>
        <div
          style={{
            display: "flex",
            justifyContent: "center",
            alignItems: "center",
            gap: "10px",
          }}
        >
          <img
            src={constants.fighterCat}
            alt="Fighter Cat"
            style={{
              width: "400px",
              borderRadius: "10px",
            }}
          />
          <img
            src={constants.catCoke}
            alt="Cate Coke"
            style={{
              width: "400px",
              borderRadius: "10px",
            }}
          />
          <audio controls>
            <source src={constants.fah} type="audio/mp3" />
            Your browser does not support the audio element.
          </audio>
        </div>
      </div>
    );
  }
}
export default MyImagesComp;
