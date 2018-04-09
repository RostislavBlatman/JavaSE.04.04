package main.java;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Movieteka implements Serializable {

    private String title;
    private Set<Movie> movieteka = new LinkedHashSet<>();

    public Movieteka(String title) {
        this.title = title;
    }

    public Movieteka(String title, Movie movie) {
        this.title = title;
        movieteka.add(movie);
    }

    public Movieteka(String title, List<Movie> movies) {
        this.title = title;
        movieteka.addAll(movies);
    }

    public void addMovie(Movie movie) {
        movieteka.add(movie);
    }

    public Set<Movie> loadMovieteka (String fileName){
        return IOUtils.readFromFile(fileName).getMovietekaSet();
    }


    public void deleteMovie(int indexMovie) {
        if (indexMovie >= 1) {
            movieteka.remove(movieteka.toArray()[indexMovie - 1]);
        } else {
            System.out.println("Input correct index of movie");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int indexMovie = 0; indexMovie < movieteka.toArray().length; indexMovie++) {
            stringBuilder.append(indexMovie + 1).append(" - ").append(movieteka.toArray()[indexMovie]).append("\n");
        }

        return stringBuilder.toString();
    }

    public Set<Movie> getMovietekaSet() {
        return movieteka;
    }

    public String getTitle() {
        return title;
    }
}
