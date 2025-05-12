function scrollComingSoon(direction) {
  const container = document.getElementById("comingSoon");
  const scrollAmount = 180; // adjust based on card width + margin
  container.scrollBy({
    left: scrollAmount * direction,
    behavior: "smooth",
  });
}
