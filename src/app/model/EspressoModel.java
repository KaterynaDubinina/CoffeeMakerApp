package app.model;

public class EspressoModel implements CoffeeMakerModel {
    @Override
    public void make() {
        System.out.println("\u2705   Ось ваш Еспресо \u2615 Насолоджуйтесь");
    }
}