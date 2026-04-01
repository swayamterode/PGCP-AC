// import Clock from "./components/clock";
// import Counter from "./components/counter";
// import FriendDetailComp from "./components/FriendDetailComp";
// import ParentComp from "./components/parentChild/ParentComp";
// import MyDetailComp from "./components/MyDetailComp";
// import MyImagesComp from "./components/multimedia/myImagesComp";
import ChangeImageComp from "./components/changeImage/changeImageComp";
import SlideImageComp from "./components/slideImage/slideImageComp";
import ToggleImage from "./components/toggleImageComp/ToggleImage";
const App = () => {
  return (
    <div>
      {/* <MyDetailComp fname={"Swayam"} lname={"Terode"} gender={"Male"} city={"Nagpur"} country={"India"} id="my-details-component" /> */}
      {/* <FriendDetailComp fname="John" lname="Doe" gender="Male" city="New York" country="USA" /> <Counter /> */}
      {/* <Clock /> */}
      {/* <ParentComp /> */}
      {/* <MyImagesComp /> */}
      <ToggleImage />
      <ChangeImageComp />
      <SlideImageComp />
    </div>
  );
};

export default App;
