package com.thouightworks.bootcamp;

public class Pigs implements Animal {
    private String pigNoice;

    public Pigs() {
        this.pigNoice = "Oink!!";
    }

    public String makeNoice() {
        return pigNoice;
    }
}
