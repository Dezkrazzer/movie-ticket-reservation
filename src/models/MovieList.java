package models;

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
}
