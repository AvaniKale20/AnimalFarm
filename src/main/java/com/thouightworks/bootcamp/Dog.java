package com.thouightworks.bootcamp;

public class Dog implements Animal {

    private String dogNoice;

    public Dog() {
        this.dogNoice = "Bark";
    }

    public String makeNoice() {
        return dogNoice;
    }


}
