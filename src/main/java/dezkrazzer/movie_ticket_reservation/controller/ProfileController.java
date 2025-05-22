package dezkrazzer.movie_ticket_reservation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dezkrazzer.movie_ticket_reservation.models.Movie;
import dezkrazzer.movie_ticket_reservation.models.MovieData;
import jakarta.servlet.http.HttpSession;

@Controller
public class ProfileController {
    @GetMapping("/profile")
public String showUserProfile(HttpSession session, Model model) {
    String username = (String) session.getAttribute("loggedInUser");
    if (username == null) {
        return "redirect:/auth/login"; // redirect jika belum login
    }

    @SuppressWarnings("unchecked")
    List<Map<String, Object>> myTickets = (List<Map<String, Object>>) session.getAttribute("myTickets");
    if (myTickets == null) {
        myTickets = new ArrayList<>();
    }

    // Ambil informasi film untuk setiap tiket
    List<Map<String, Object>> ticketViews = new ArrayList<>();
    for (Map<String, Object> ticket : myTickets) {
        String movieId = (String) ticket.get("movieId");
        Movie movie = MovieData.getMovieById(movieId);

        if (movie != null) {
            Map<String, Object> ticketView = new HashMap<>();
            ticketView.put("judulFilm", movie.getJudulFilm());
            ticketView.put("posterFilm", movie.getPosterFilm());
            ticketView.put("studio", movie.getAuditorium());
            ticketView.put("showTime", movie.getShowTime());
            ticketView.put("selectedSeats", ticket.get("selectedSeats"));
            ticketView.put("tiketId", ticket.get("tiketId"));
            ticketViews.add(ticketView);
        }
    }

    model.addAttribute("username", username);
    model.addAttribute("tickets", ticketViews);
    return "profile";
}
}
