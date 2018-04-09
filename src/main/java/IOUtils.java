package main.java;


import java.io.*;

public class IOUtils {
    public static void writeInFile(String fileName, Object object) {
        if (fileName == null || fileName.equals("") || object == null){
            System.out.println("FileName or movieteka is empty");
        }else {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName.replaceAll("\\s", "") + ".out"))) {
                objectOutputStream.writeObject(object);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static Movieteka readFromFile(String fileName) {
        if(fileName == null || fileName.equals("")){
            System.out.println("FileNAme is empty");
            return null;
        }else {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName.replaceAll("\\s", "") + ".out"))) {
                return (Movieteka) objectInputStream.readObject();
            } catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
    }

}
