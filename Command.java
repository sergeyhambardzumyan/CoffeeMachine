package com.CoffeeMachine;

public class Command {
    private String type ;
    private int sugarCount;


    public Command(String[] array) {
        this.type=array[0];
        this.sugarCount = Integer.parseInt(array[1]);
    }





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }




}
