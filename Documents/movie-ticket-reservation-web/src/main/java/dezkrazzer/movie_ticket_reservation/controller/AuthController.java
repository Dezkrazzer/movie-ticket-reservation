package dezkrazzer.movie_ticket_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dezkrazzer.movie_ticket_reservation.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginForm() {
        return "auth/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request, Model model) {
        if (userService.login(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", username);
            return "redirect:/";
        }
        model.addAttribute("error", "Username atau password salah!");
        return "auth/login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/auth/login";
    }

    @GetMapping("/register")
    public String registerForm() {
        return "auth/register";
    }

    @PostMapping("/register")
    public String register(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String confirmPassword,
            Model model) {

        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "Konfirmasi password tidak cocok!");
            return "auth/register";
        }

        if (userService.register(username, password)) {
            return "redirect:/auth/login";
        }

        model.addAttribute("error", "Username sudah ada!");
        return "auth/register";
    }
}