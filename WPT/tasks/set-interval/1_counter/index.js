let counter = 0;

function setCounter() {
  counter++;
  console.log("Counter:", counter);
}

setCounter();
setInterval(setCounter, 1000);
