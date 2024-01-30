package app;

import app.controller.AppController;

public class App {

    public static void main(String[] args) {
        AppController controller = new AppController();
        System.out.println("\n\u2615   Цей додаток для управління кавомашиною");
        controller.runApp();
    }
}
