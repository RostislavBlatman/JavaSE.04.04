package main.java;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Movie implements Serializable {

    private String title;
    private Set<Actor> actors = new LinkedHashSet<>();

    public Movie (String title){
        this.title = title;
    }

    public Movie (String title, Actor actor){
        this.title = title;
        actors.add(actor);
    }

    public Movie (String title, List<Actor> actors){
        this.title = title;
        this.actors.addAll(actors);
    }

    @Override
    public String toString() {
        return title;
    }

}
