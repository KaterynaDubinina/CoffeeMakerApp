package app.entity;

import app.model.CoffeeMakerModel;

public class Maker {
    public CoffeeMakerModel coffee;

    public void setCoffee(CoffeeMakerModel coffee) {
        this.coffee = coffee;
    }

    public void startMakingCoffee() {
        coffee.make();
    }
}
