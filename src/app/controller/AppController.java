package app.controller;

import app.entity.Maker;
import app.model.CappuccinoModel;
import app.model.CoffeeMakerModel;
import app.model.EspressoModel;
import app.model.LatteModel;
import app.view.AppView;

public class AppController {

    Maker maker = new Maker();

    public void runApp() {
        int option;
        do {
            option = AppView.getOption();
            switch (option) {
                case 1 -> prepareAndMakeCoffee(new EspressoModel());
                case 2 -> prepareAndMakeCoffee(new CappuccinoModel());
                case 3 -> prepareAndMakeCoffee(new LatteModel());
                case 0 -> System.out.println("\u274E Додаток вимкнено успішно.");
                default -> System.out.println("\u274C   Невірна опція." +
                        "\n\u2B07\uFE0F   Спробуйте ще.");
            }
        } while (option != 1 && option != 2 && option != 3 && option != 0);
        System.exit(0);
    }

    private void prepareAndMakeCoffee(CoffeeMakerModel coffee) {
        maker.setCoffee(coffee);
        maker.startMakingCoffee();
    }
}
