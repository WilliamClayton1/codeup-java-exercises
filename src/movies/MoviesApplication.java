package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static String getAllMovies() {

        for (Movie movie : MoviesArray.findAll()) {
            System.out.println(movie.getName());
        }
        return "This is what we got.";
    }

    public static String getAnimatedMovies(){
        for (Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().contains("animated")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
        return "This is what we got.";
    }

    public static String getDramaMovies(){
        for (Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().contains("drama")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
        return "This is what we got.";
    }

    public static String getHorrorMovies(){
        for (Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().contains("horror")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
        return "This is what we got.";
    }

    public static String getSciFiMovies(){
        for (Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().contains("scifi")) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
        return "This is what we got.";
    }

    public static void main (String[] args) {

        boolean pickMovie = true;

        do {

            Input user = new Input();


            String[] usersChoice = {"0 - Exit", "1 - View all movies", "2 - View movies in the animated category", "3 - View movies in the drama category", "4 - View movies in the horror category", "5 - View movies in the sci-fi category"};

            System.out.printf("%n");
            System.out.println("What would you like to do?");
            System.out.printf("%n");

            for (String choice : usersChoice) {
                System.out.println(choice);
            }

            System.out.printf("%n");

            int usersNumber = user.getInt();

            switch (usersNumber) {
                case 0: pickMovie = false;
                    break;

                case 1: getAllMovies();
                    break;

                case 2: getAnimatedMovies();
                    break;

                case 3: getDramaMovies();
                    break;

                case 4: getHorrorMovies();
                    break;

                case 5: getSciFiMovies();
                    break;
            }

        } while (pickMovie);

    }

}
