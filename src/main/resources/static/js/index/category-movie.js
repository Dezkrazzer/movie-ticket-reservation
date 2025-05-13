function scrollCategories(distance) {
  const container = document.getElementById("categoryContainer");
  container.scrollBy({ left: distance, behavior: "smooth" });
}
