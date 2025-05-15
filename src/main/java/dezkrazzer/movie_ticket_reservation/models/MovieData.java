package dezkrazzer.movie_ticket_reservation.models;


import java.util.ArrayList;

public class MovieData {
    public static ArrayList<MovieList> getMovieList() {
        ArrayList<MovieList> movieList = new ArrayList<>();
        
        // DATA FILM STUDIO 1
        movieList.add(new MovieList(
            "001",
            "Minions",
            "Animation",
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://example.com/minions.jpg",
            40000,
            "10:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "002",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://example.com/interstellar.jpg",
            40000,
            "12:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "003",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://example.com/avengers.jpg",
            40000,
            "14:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "004",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://example.com/spiderman.jpg",
            40000,
            "16:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "005",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://example.com/lionking.jpg",
            40000,
            "18:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "006",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben.",
            "https://example.com/yowisben.jpg",
            40000,
            "20:00",
            1,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "007",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://example.com/dilan.jpg",
            40000,
            "22:00",
            1,
            0,
            ""
        ));
        // DATA FILM STUDIO 2
        movieList.add(new MovieList(
            "005",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://example.com/lionking.jpg",
            40000,
            "10:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList(
            "007",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://example.com/dilan.jpg",
            40000,
            "12:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "006",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben.",
            "https://example.com/yowisben.jpg",
            40000,
            "14:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "003",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://example.com/avengers.jpg",
            40000,
            "16:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "001",
            "Minions",
            "Animation", 
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://example.com/minions.jpg",
            40000,
            "18:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "004",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://example.com/spiderman.jpg",
            40000,
            "20:00",
            2,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "002",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://example.com/interstellar.jpg",
            40000,
            "22:00",
            2,
            0,
            ""
        ));
        // DATA FILM STUDIO 3
        movieList.add(new MovieList( 
            "006",
            "Yowis Ben 3",
            "Comedy",
            "Yowis Ben 3 adalah film komedi yang mengisahkan petualangan Yowis Ben",
            "https://example.com/yowisben.jpg",
            40000,
            "10:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "005",
            "The Lion King",
            "Animation",
            "The Lion King adalah film animasi yang mengisahkan petualangan Simba.",
            "https://example.com/lionking.jpg",
            40000,
            "12:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "001",
            "Minions",
            "Animation",
            "Minions adalah film animasi yang mengisahkan petualangan para Minion.",
            "https://example.com/minions.jpg",
            40000,
            "14:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "002",
            "Interstellar",
            "Story",
            "Interstellar adalah film fiksi ilmiah yang mengisahkan perjalanan luar angkasa.",
            "https://example.com/interstellar.jpg",
            40000,
            "16:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "003",
            "Avengers: Endgame",
            "Action",
            "Avengers: Endgame adalah film superhero yang mengisahkan perjuangan Avengers.",
            "https://example.com/avengers.jpg",
            40000,
            "18:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "007",
            "Dilan 1990",
            "Romance",
            "Dilan 1990 adalah film romantis yang mengisahkan cinta remaja.",
            "https://example.com/dilan.jpg",
            40000,
            "20:00",
            3,
            0,
            ""
        ));
        movieList.add(new MovieList( 
            "004",
            "Spiderman",
            "Action",
            "Spiderman adalah film superhero yang mengisahkan petualangan Spiderman.",
            "https://example.com/spiderman.jpg",
            40000,
            "22:00",
            3,
            0,
            ""
        ));

        return movieList;
    }
}
