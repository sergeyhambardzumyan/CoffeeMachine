package com.CoffeeMachine;

public class CoffeeMachine {


    public CoffeeMachine makeDrink(Command command) {
        if (command.getType().equals("C")) {
            return new Coffee("Coffee" , command.getSugarCount());
        } else {
            return new Tea("Tea", command.getSugarCount());
        }
    }


}
