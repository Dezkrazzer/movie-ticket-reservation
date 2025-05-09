package dezkrazzer.movie_ticket_reservation.models;

import java.util.Arrays;

public class SeatStatus {
    public String jadwal;
    public char[][] seats;

    public SeatStatus(String jadwal) {
        this.jadwal = jadwal;
        this.seats = new char[6][8];
        for (char[] row : seats) {
            Arrays.fill(row, 'O'); // O berarti kursi kosong
        }
    }

    public String getJadwal() { 
        return jadwal; 
    }
    public char[][] getSeats() { 
        return seats; 
    }
}
