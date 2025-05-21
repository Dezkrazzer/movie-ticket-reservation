package dezkrazzer.movie_ticket_reservation.controller;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dezkrazzer.movie_ticket_reservation.models.MovieData;
import dezkrazzer.movie_ticket_reservation.models.MovieList;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String searchMovies(
            @RequestParam(name = "query", required = false) String query,
            Model model) {

        List<MovieList> allMovies = MovieData.getMovieList();

        // Filter berdasarkan query
        List<MovieList> filteredMovies = allMovies.stream()
                .filter(movie -> query == null || query.isEmpty()
                || movie.getJudulFilm().toLowerCase().contains(query.toLowerCase())
                || movie.getCategoryFilm().toLowerCase().contains(query.toLowerCase())
                || String.valueOf(movie.getAuditorium()).contains(query)
                || movie.getShowTime().contains(query))
                .collect(Collectors.toList());

        // Bagi hasil search berdasarkan studio
        List<MovieList> studio1 = filteredMovies.stream()
                .filter(m -> m.getAuditorium() == 1)
                .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
                .collect(Collectors.toList());

        List<MovieList> studio2 = filteredMovies.stream()
                .filter(m -> m.getAuditorium() == 2)
                .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
                .collect(Collectors.toList());

        List<MovieList> studio3 = filteredMovies.stream()
                .filter(m -> m.getAuditorium() == 3)
                .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
                .collect(Collectors.toList());

        // Tambahkan ke model
        model.addAttribute("studio1Movies", studio1);
        model.addAttribute("studio2Movies", studio2);
        model.addAttribute("studio3Movies", studio3);
        model.addAttribute("query", query);

        return "search/search";
    }

}



    /*  ========== KODE BACKUP ==========
    @GetMapping("/search")
    public String searchMovies(
            @RequestParam(name = "query", required = false) String query,
            Model model) {

        List<MovieList> allMovies = MovieData.getMovieList();

        List<MovieList> filteredMovies = allMovies.stream()
                .filter(movie
                        -> query == null || query.isEmpty()
                || movie.getJudulFilm().toLowerCase().contains(query.toLowerCase())
                || movie.getCategoryFilm().toLowerCase().contains(query.toLowerCase())
                || String.valueOf(movie.getAuditorium()).contains(query)
                || movie.getShowTime().contains(query))
                .sorted(Comparator.comparing(m -> LocalTime.parse(m.getShowTime())))
                .collect(Collectors.toList());

        model.addAttribute("studio1Movies", filteredMovies);
        model.addAttribute("query", query);
        return "search/search";
    } */
