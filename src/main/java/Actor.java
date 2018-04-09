package main.java;

import java.io.Serializable;

public class Actor implements Serializable
{

    private String name;
    private String surname;

    public Actor(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
