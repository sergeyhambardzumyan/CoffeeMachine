package com.CoffeeMachine;

public class Tea extends CoffeeMachine {
    private String name;
    private int sugarCount;

    public Tea(String name, int sugarCount) {
        this.name = name;
        this.sugarCount = sugarCount;
    }

    @Override
    public String toString() {
        return name + " with " + sugarCount + " spoon sugar";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }
}
