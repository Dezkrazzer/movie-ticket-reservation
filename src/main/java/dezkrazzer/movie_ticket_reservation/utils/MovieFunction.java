package dezkrazzer.movie_ticket_reservation.utils;

public class MovieFunction {
    public static void tampilkanPilihanMenu() {
        System.out.println("\n╔==============================================╗");
        System.out.println("|>>               Menu Utama                 <<|");
        System.out.println("|==============================================|");
        System.out.printf("| %-2s | %-39s |\n", "1", "Tampilkan Jadwal");
        System.out.printf("| %-2s | %-39s |\n", "2", "Cari Jadwal");
        System.out.printf("| %-2s | %-39s |\n", "3", "Tiket Saya");
        System.out.printf("| %-2s | %-39s |\n", "4", "Keluar");
        System.out.println("╚==============================================╝");
        System.out.print("> Pilih menu: ");
    }

    public static void tampilkanJudul() {
        System.out.println("╔==============================================╗");
        System.out.println("|>>             Aplikasi Bioskop             <<|");
        System.out.println("╚==============================================╝");
    }

    public static void keluarAplikasi() {
        System.out.println("\nTerima kasih, keluar dari aplikasi...\n");

        System.out.println("***********************************************");
        System.out.println("**         Aplikasi ini dibuat oleh          **");
        System.out.println("**         Lazuardi Akbar Imani              **");
        System.out.println("***********************************************");
    }
}
