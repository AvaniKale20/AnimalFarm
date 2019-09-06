package com.thouightworks.bootcamp;

public class Cows implements Animal {
    private String cowsNoice;

    public Cows() {
        this.cowsNoice = "Bow!!";
    }

    public String makeNoice() {
        return cowsNoice;
    }


}
