package dezkrazzer.movie_ticket_reservation.models;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MovieData {
    public static ArrayList<MovieList> getMovieList() {
        ArrayList<MovieList> movieList = new ArrayList<>();
        
        // DATA FILM STUDIO 1
        movieList.add(new MovieList(
            "001A",
            "Minions",
            "Animation",
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/e/ed/Despicable_Me_4_Theatrical_Release_Poster.jpeg/250px-Despicable_Me_4_Theatrical_Release_Poster.jpeg",
            40000,
            "10:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "002A",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStL4ILno0Cf5XXC-EyfnHjjqsUZjAGkjGwBQ&s",
            40000,
            "12:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "003A",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://images-cdn.ubuy.co.id/634ffe4b05d16a708944a5ec-avengers-endgame-movie-poster-2-sided.jpg",
            40000,
            "14:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "004A",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://m.media-amazon.com/images/I/91B64g3nQfL.jpg",
            40000,
            "16:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "005A",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://filmartgallery.com/cdn/shop/files/The-Lion-King-Vintage-Movie-Poster-Original_436dcbed.jpg?v=1741713241",
            40000,
            "18:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "006A",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmuukSMYDVhQAsfuXj0OEVRyeeEszX7ywFnA&s",
            40000,
            "20:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "007A",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://m.media-amazon.com/images/M/MV5BNzVhNGY3NGMtODgzNS00ZjI4LWI1MDgtNjM0OTNjYmNiOTAyXkEyXkFqcGc@._V1_.jpg",
            40000,
            "22:00",
            1,
            0,
            ""
        ));
        // DATA FILM STUDIO 2
        movieList.add(new MovieList(
            "005B",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://filmartgallery.com/cdn/shop/files/The-Lion-King-Vintage-Movie-Poster-Original_436dcbed.jpg?v=1741713241",
            40000,
            "10:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "007B",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://m.media-amazon.com/images/M/MV5BNzVhNGY3NGMtODgzNS00ZjI4LWI1MDgtNjM0OTNjYmNiOTAyXkEyXkFqcGc@._V1_.jpg",
            40000,
            "12:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "006B",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmuukSMYDVhQAsfuXj0OEVRyeeEszX7ywFnA&s",
            40000,
            "14:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "003B",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://images-cdn.ubuy.co.id/634ffe4b05d16a708944a5ec-avengers-endgame-movie-poster-2-sided.jpg",
            40000,
            "16:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "001B",
            "Minions",
            "Animation", 
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/e/ed/Despicable_Me_4_Theatrical_Release_Poster.jpeg/250px-Despicable_Me_4_Theatrical_Release_Poster.jpeg",
            40000,
            "18:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "004B",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://m.media-amazon.com/images/I/91B64g3nQfL.jpg",
            40000,
            "20:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "002B",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStL4ILno0Cf5XXC-EyfnHjjqsUZjAGkjGwBQ&s",
            40000,
            "22:00",
            2,
            0,
            ""
        ));
        // DATA FILM STUDIO 3
        movieList.add(new MovieList( 
            "006C",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmuukSMYDVhQAsfuXj0OEVRyeeEszX7ywFnA&s",
            40000,
            "10:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "005C",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://filmartgallery.com/cdn/shop/files/The-Lion-King-Vintage-Movie-Poster-Original_436dcbed.jpg?v=1741713241",
            40000,
            "12:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "001C",
            "Minions",
            "Animation",
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://upload.wikimedia.org/wikipedia/id/thumb/e/ed/Despicable_Me_4_Theatrical_Release_Poster.jpeg/250px-Despicable_Me_4_Theatrical_Release_Poster.jpeg",
            40000,
            "14:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "002C",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStL4ILno0Cf5XXC-EyfnHjjqsUZjAGkjGwBQ&s",
            40000,
            "16:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "003C",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://images-cdn.ubuy.co.id/634ffe4b05d16a708944a5ec-avengers-endgame-movie-poster-2-sided.jpg",
            40000,
            "18:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "007C",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://m.media-amazon.com/images/M/MV5BNzVhNGY3NGMtODgzNS00ZjI4LWI1MDgtNjM0OTNjYmNiOTAyXkEyXkFqcGc@._V1_.jpg",
            40000,
            "20:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "004C",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://m.media-amazon.com/images/I/91B64g3nQfL.jpg",
            40000,
            "22:00",
            3,
            0,
            ""
        ));

        return movieList;
    }
    
    public static Movie getMovieById(String movieId) {
        for (MovieList movie : getMovieList()) {
            if (movie.getMovieID().equals(movieId)) {
                return movie;
            }
        }
        return null; // Jika tidak ditemukan
    }
}
