package main;
import controller.MainController;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        MainView view = new MainView();
        new MainController(view);
        view.setVisible(true);
    }
}