package app.model;

public class CappuccinoModel implements CoffeeMakerModel {
    @Override
    public void make() {
        System.out.println("\u2705   Ось ваш Капучино \u2615 Насолоджуйтесь");
    }
}
