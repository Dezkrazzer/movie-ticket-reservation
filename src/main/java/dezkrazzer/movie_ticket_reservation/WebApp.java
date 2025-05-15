package dezkrazzer.movie_ticket_reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebApp {
    @GetMapping("/debugging")
    public String hello() {
        return "Welcome to Movie Ticket Reservation Web App!";
    }

    /*@GetMapping("/")
    public String showIndex() {
        return "index";
    }*/

    @GetMapping("/register")
    public String showRegister() {
        return "auth/register";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "auth/login";
    }
}
