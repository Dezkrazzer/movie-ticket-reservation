package dezkrazzer.movie_ticket_reservation.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dezkrazzer.movie_ticket_reservation.models.Movie;
import dezkrazzer.movie_ticket_reservation.models.MovieData;
import jakarta.servlet.http.HttpSession;

@Controller
public class BuyController {

    // Method untuk generate kode tiket
    // Format: CGO-ddMMyyyyHHmmss
    public static String generateKodeTiket() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        String waktuFormatted = now.format(formatter);
        return "CGO-" + waktuFormatted;
    }

    // Method untuk menampilkan halaman pembelian tiket
    @GetMapping("/buyticket")
    public String showBuyTicketPage(@RequestParam("id") String movieId, Model model) {
        Movie selectedMovie = MovieData.getMovieById(movieId);

        if (selectedMovie == null) {
            return "redirect:/error"; // Atur halaman error jika ID film tidak valid
        }

        model.addAttribute("movie", selectedMovie);
        return "buyticket";
    }

    // Method untuk memproses pembelian tiket
    @PostMapping("/buyticket")
    public String processBuyTicket(
            @RequestParam("movieId") String movieId,
            @RequestParam("selectedSeats") String selectedSeats,
            @RequestParam("totalPrice") int totalPrice,
            Model model,
            HttpSession session
    ) {
        // Cari movie berdasarkan ID
        Movie selectedMovie = MovieData.getMovieById(movieId);
        if (selectedMovie == null) {
            return "redirect:/error";
        }

        // Ambil username dari session (jika ada)
        String username = (String) session.getAttribute("loggedInUser");
        if (username == null) {
            return "redirect:/auth/login"; // jika user belum login
        }
        
        String tiketId = generateKodeTiket();

        // Buat Map untuk simpan data tiket
        Map<String, Object> ticketData = new HashMap<>();
        ticketData.put("movieId", movieId);
        ticketData.put("tiketId", tiketId);
        ticketData.put("selectedSeats", selectedSeats);
        ticketData.put("totalPrice", totalPrice);

        // Ambil atau inisialisasi daftar tiket dari session
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> myTickets = (List<Map<String, Object>>) session.getAttribute("myTickets");
        if (myTickets == null) {
            myTickets = new ArrayList<>();
        }

        myTickets.add(ticketData);
        session.setAttribute("myTickets", myTickets);

        model.addAttribute("movie", selectedMovie);
        System.out.println(">>>>> Setting lastTicket: " + ticketData);
        session.setAttribute("lastTicket", ticketData);

        return "redirect:/ticketconfirmation"; 
    }

    @GetMapping("/ticketconfirmation")
    public String showTicketConfirmation(HttpSession session, Model model) {
        @SuppressWarnings("unchecked")
        Map<String, Object> lastTicket = (Map<String, Object>) session.getAttribute("lastTicket");
        System.out.println(">>>>> Reading lastTicket from session: " + lastTicket);

        if (lastTicket == null) {
            return "redirect:/mytickets"; // fallback jika tidak ada tiket
        }

        String movieId = (String) lastTicket.get("movieId");
        Movie movie = MovieData.getMovieById(movieId);

        model.addAttribute("ticket", lastTicket);
        model.addAttribute("movie", movie);

        return "ticketconfirmation";
    }

    @GetMapping("/mytickets")
    public String showMyTickets(HttpSession session, Model model) {
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> myTickets = (List<Map<String, Object>>) session.getAttribute("myTickets");
        if (myTickets == null) {
            myTickets = new ArrayList<>();
        }

        model.addAttribute("myTickets", myTickets);
        return "mytickets"; 
    }
}
