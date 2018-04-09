package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleInteractivePanel {

    String fileName;


    public void init(){
        System.out.println("Welcome to \"Mediateka\"\nPlease, input name for your collection of movie: ");
        Scanner scanner = new Scanner(System.in);
        Movieteka movieteka = new Movieteka(scanner.next());
        boolean movieMakerIsOn = true;
        while (movieMakerIsOn) {
            System.out.println("Input name of movie: ");
            String nameMovie = scanner.next();
            List<Actor> actors = new ArrayList<>();
            boolean actorMakerIsOn = true;
            while (actorMakerIsOn){
                System.out.println("Input name of actor: ");
                String actorName = scanner.next();
                System.out.println("Input his surname: ");
                String actorSurname = scanner.next();
                Actor actor = new Actor(actorName,actorSurname);
                actors.add(actor);
                System.out.println("Do you want to add one more actor? (Y/N) ");
                switch (scanner.next().toLowerCase()){
                    case "y":
                        break;
                    case "n":
                        actorMakerIsOn = false;
                        break;
                    default:
                        actorMakerIsOn = false;
                }
            }
            Movie movie = new Movie(nameMovie,actors);
            movieteka.addMovie(movie);
            System.out.println("Do you want to add one more movie? (Y/N) ");
            switch (scanner.next().toLowerCase()){
                case "y":
                    break;
                case "n":
                    movieMakerIsOn = false;
                    break;
                default:
                    movieMakerIsOn = false;
            }
        }
        System.out.println("Input name for output file: ");
        fileName = scanner.next();
        IOUtils.writeInFile(fileName,movieteka);
    }

}
