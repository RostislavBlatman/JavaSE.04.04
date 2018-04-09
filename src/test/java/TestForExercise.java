package test.java;

import main.java.IOUtils;
import main.java.Movie;
import main.java.Movieteka;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForExercise {

    @DisplayName("Test for write and read Mediatekas's file")
    @Test
    void testForExercise(){
        String name = "test Name";
        Movieteka testMovieteka = new Movieteka(name,new Movie(name));
        IOUtils.writeInFile(name,testMovieteka);
        testMovieteka = IOUtils.readFromFile(name);
        assertEquals(testMovieteka.toString(),"1 - test Name\n");
        testMovieteka.deleteMovie(1);
        assertEquals(testMovieteka.toString(),"");
    }

}
