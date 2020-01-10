package com.company;

import java.util.Scanner;

public class CoffeeMachine {
    //attribute
    int water = 10;
    int coffee = 10;
    //method
    public  void  MakeCoffee(int iAmericano , int iLatte){
        if (iAmericano > 0) {
            for (int i = 0; i < iAmericano; i++)
                if ( americano  != null)
                    System.out.println("Here your americano");
                else
                    System.out.println("Sorry can't make it.");
            }
        }

    }
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
