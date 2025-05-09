import core.TicketReservation;
import java.util.ArrayList;
import java.util.Scanner;
import models.MovieList;
import utils.MovieFunction;

public class Main {
    static ArrayList<MovieList> movieList = new ArrayList<>();

    public static void main(String[] args) { 
        MovieFunction.tampilkanJudul();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            MovieFunction.tampilkanPilihanMenu();
            int pilihan = scanner.nextInt();

            switch (pilihan) { 
                case 1 -> TicketReservation.tampilkanJadwal(movieList);
                case 2 -> TicketReservation.cariTiket(scanner, movieList);
                case 3 -> TicketReservation.lihatTiketSaya();
                case 4 -> {
                    MovieFunction.keluarAplikasi();
                    return;
                }
                default -> System.out.println("[ERROR] | Pilihan tidak valid.");
            }
        }
    }
}