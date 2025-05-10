package dezkrazzer.movie_ticket_reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebApp {
    @GetMapping("/debugging")
    public String hello() {
        return "Welcome to Movie Ticket Reservation Web App!";
    }

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
}
