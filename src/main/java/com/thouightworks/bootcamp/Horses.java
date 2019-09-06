package com.thouightworks.bootcamp;

public class Horses implements Animal {
    private String horsesNoice;

    public Horses() {
        this.horsesNoice = "Neigh!!!";
    }

    public String makeNoice() {
        return horsesNoice;
    }

}
