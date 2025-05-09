package dezkrazzer.movie_ticket_reservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApp {
    @GetMapping("/")
    public String hello() {
        return "Welcome to Movie Ticket Reservation Web App!";
    }
}
