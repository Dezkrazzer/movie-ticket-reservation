package models;

public class Movie {
    private String judulFilm;
    private double harga;
    private String showTime;
    protected int auditorium;

    public Movie(
        String judulFilm, 
        double harga, 
        String showTime,
        int auditorium) {

            this.judulFilm = judulFilm;
            this.harga = harga;
            this.showTime = showTime;
            this.auditorium = auditorium;
    }

    // Getter dan Setter
    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("[ERROR] Harga yang dimasukkan tidak valid");
        }
    }

    public String getShowTime() { // Perubahan disini
        return showTime;
    }

    public void setShowTime(String showTime) { // Perubahan disini
        this.showTime = showTime;
    }

    public int getAuditorium() {
        return auditorium;
    }
    
    public void setAuditorium(int auditorium) {
        this.auditorium = auditorium;
    }
}
