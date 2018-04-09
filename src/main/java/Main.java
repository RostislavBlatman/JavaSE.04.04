package main.java;

public class Main {
    public static void main(String[] args) {
        SimpleInteractivePanel simpleInteractivePanel = new SimpleInteractivePanel();
        simpleInteractivePanel.init();
        Movieteka movieteka = IOUtils.readFromFile(simpleInteractivePanel.fileName);
        System.out.println(movieteka);

    }
}
