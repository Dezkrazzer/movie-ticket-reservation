package dezkrazzer.movie_ticket_reservation.controller;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dezkrazzer.movie_ticket_reservation.models.Movie;
import dezkrazzer.movie_ticket_reservation.models.MovieData;
import dezkrazzer.movie_ticket_reservation.models.MovieList;

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

    @GetMapping("/jadwaltayang")
public String showJadwal(Model model) {
    List<MovieList> allMovies = MovieData.getMovieList();

    List<MovieList> studio1 = allMovies.stream()
        .filter(m -> m.getAuditorium() == 1)
        .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
        .collect(Collectors.toList());

    List<MovieList> studio2 = allMovies.stream()
        .filter(m -> m.getAuditorium() == 2)
        .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
        .collect(Collectors.toList());

    List<MovieList> studio3 = allMovies.stream()
        .filter(m -> m.getAuditorium() == 3)
        .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
        .collect(Collectors.toList());

    model.addAttribute("studio1Movies", studio1);
    model.addAttribute("studio2Movies", studio2);
    model.addAttribute("studio3Movies", studio3);

    return "jadwaltayang";
}
}