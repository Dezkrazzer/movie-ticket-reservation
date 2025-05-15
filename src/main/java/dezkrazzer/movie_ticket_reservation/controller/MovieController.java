package dezkrazzer.movie_ticket_reservation.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dezkrazzer.movie_ticket_reservation.models.Movie;
import dezkrazzer.movie_ticket_reservation.models.MovieData;

@Controller
public class MovieController {
    @GetMapping("/")
    public String showNowPlaying(Model model) {

    List<Movie> allMovies = MovieData.getMovieList()
        .stream()
        .map(movieList -> (Movie) movieList)
        .toList();
        
    Set<Movie> uniqueMovies = new HashSet<>(allMovies);

    model.addAttribute("movies", uniqueMovies);
    return "index";
    }
}
