package com.company;

public class CoffeeMachine {
    //attribute
    int water = 10;
    int coffee = 10;
    //method
    public Americano MakeAmericano() {

        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 2;

            Americano americano = new Americano();
            return americano;
        } else
            return null;
    }
}
