package dezkrazzer.movie_ticket_reservation.models;

import dezkrazzer.movie_ticket_reservation.core.TicketReservation;

public class MovieList extends Movie {
    private int jumlahTiket;
    protected String noSeat;

    public MovieList(
        String judulFilm, 
        double harga, 
        String showTime,
        int auditorium,
        int jumlahTiket,
        String noSeat) {    

            super(judulFilm, harga, showTime, auditorium);
            this.jumlahTiket = jumlahTiket;
            this.noSeat = noSeat;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public String getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(String noSeat) {
        this.noSeat = noSeat;
    }
    
    public double hitungHargaTotal() {
        return getHarga() * jumlahTiket;
    }

    @Override
    public void tampilkanTiket() {
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║            MOVIE TICKET             ║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.printf("║ Movie      : %-22s ║\n", getJudulFilm());
        System.out.println("╠═════════════════════════════════════╣");
        System.out.printf("║ Show Time  : %-22s ║\n", getShowTime());
        System.out.printf("║ Auditorium : %-22s ║\n", getAuditorium());
        System.out.println("╠═════════════════════════════════════╣");
        System.out.printf("║ Seat(s)    : %-22s ║\n", getNoSeat());
        System.out.println("╠═════════════════════════════════════╣");
        System.out.printf("║ Total Price: Rp%,15.0f      ║\n", hitungHargaTotal());
        System.out.printf("║ Ticket(s)  : %-22d ║\n", getJumlahTiket());
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║ ░█░█ █░█ ░█░░ ░█░ █░█░ █░░█         ║");
        System.out.printf("║ %-35s ║\n", TicketReservation.CURRENT_DATE);
        System.out.println("╚═════════════════════════════════════╝");
        System.out.println();
    }
}
