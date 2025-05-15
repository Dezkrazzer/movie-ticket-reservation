package dezkrazzer.movie_ticket_reservation.models;

public class Movie {
    private String movieID;
    private String judulFilm;
    private String categoryFilm;
    private String sinopsisFilm;
    private String posterFilm;
    private double harga;
    private String showTime;
    protected int auditorium;
    

    public Movie(
        String movieID,
        String judulFilm,
        String categoryFilm,
        String sinopsisFilm,
        String posterFilm,
        double harga, 
        String showTime,
        int auditorium) {

            this.movieID = movieID;
            this.judulFilm = judulFilm;
            this.categoryFilm = categoryFilm;
            this.sinopsisFilm = sinopsisFilm;
            this.posterFilm = posterFilm;
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

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getCategoryFilm() {
        return categoryFilm;
    }

    public void setCategoryFilm(String categoryFilm) {
        this.categoryFilm = categoryFilm;
    }

    public String getSinopsisFilm() {
        return sinopsisFilm;
    }

    public void setSinopsisFilm(String sinopsisFilm) {
        this.sinopsisFilm = sinopsisFilm;
    }

    public String getPosterFilm() {
        return posterFilm;
    }

    public void setPosterFilm(String posterFilm) {
        this.posterFilm = posterFilm;
    }

    public void tampilkanTiket() {
        System.out.println("Film       : " + judulFilm);
        System.out.println("Auditorium : " + auditorium);
        System.out.println("Show Time  : " + showTime);
        System.out.println("Harga      : Rp " + harga);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return judulFilm.equals(movie.judulFilm);
    }

    @Override
    public int hashCode() {
        return judulFilm.hashCode();
    }
}
