function scrollNowPlaying(direction) {
  const container = document.getElementById("nowPlaying");
  const scrollAmount = 180; // adjust based on card width + margin
  container.scrollBy({
    left: scrollAmount * direction,
    behavior: "smooth",
  });
}
