function toggleMenu() {
  document.getElementById("nav-items").classList.toggle("show");
  document.getElementById("nav-right").classList.toggle("show");
}

document.querySelectorAll(".nav-item").forEach((item) => {
  item.addEventListener("click", () => {
    if (window.innerWidth <= 768) {
      document.getElementById("nav-items").classList.remove("show");
      document.getElementById("nav-right").classList.remove("show");
    }
  });
});

document.querySelectorAll(".dropdown-toggle").forEach((toggle) => {
  toggle.addEventListener("click", function (e) {
    e.stopPropagation(); // Prevent bubbling

    const dropdownMenu = document.querySelector(".dropdown-menu");
    const rect = this.getBoundingClientRect();

    // Adjust position for desktop and mobile
    if (window.innerWidth <= 768) {
      // Center the dropdown menu on mobile
      //dropdownMenu.style.top = `${rect.bottom + window.scrollY}px`;
      dropdownMenu.style.left = `50%`;
      dropdownMenu.style.transform = `translateX(-50%)`;
    } else {
      // Position the dropdown menu below the toggle on desktop
      //dropdownMenu.style.top = `${rect.bottom + window.scrollY}px`;
      dropdownMenu.style.left = `60%`;
      dropdownMenu.style.transform = `translateX(0)`;
    }

    // Toggle visibility
    dropdownMenu.classList.toggle("show");
  });
});

// Close dropdown when clicking outside
document.addEventListener("click", function () {
  document.querySelector(".dropdown-menu").classList.remove("show");
});
