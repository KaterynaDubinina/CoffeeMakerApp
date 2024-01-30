package app.model;

public class LatteModel implements CoffeeMakerModel {
    @Override
    public void make() {
        System.out.println("\u2705   Ось ваш Лате \u2615 Насолоджуйтесь");
    }
}