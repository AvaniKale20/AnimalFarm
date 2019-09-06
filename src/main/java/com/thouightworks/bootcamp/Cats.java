package com.thouightworks.bootcamp;

public class Cats implements Animal {
    private String catNoice;

    public Cats() {
        this.catNoice = "Meow!!";
    }

    public String makeNoice() {
        return catNoice;
    }
}
