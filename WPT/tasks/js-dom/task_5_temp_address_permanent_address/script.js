const tempAddressInput = document.getElementById("tempAddress");
const permAddressInput = document.getElementById("permAddress");
const copyButton = document.getElementById("copyButton");

copyButton.addEventListener("click", () => {
  const tempAddress = tempAddressInput.value;
  permAddressInput.value = tempAddress;
});
