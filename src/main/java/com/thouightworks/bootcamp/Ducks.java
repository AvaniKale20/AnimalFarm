package com.thouightworks.bootcamp;

public class Ducks implements Animal {
    private String ducksNoice;

    public Ducks() {
        this.ducksNoice = "Quack!!";
    }

    public String makeNoice() {
        return ducksNoice;
    }

}
