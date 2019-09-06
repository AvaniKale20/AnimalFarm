package com.thoughtworks.bootcamp;

import com.thouightworks.bootcamp.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void givenDogAnimal_WhenMakeNoice_ThenReturnBark() {
        Dog dog = new Dog();
        Assertions.assertEquals("Bark", dog.makeNoice());
    }

    @Test
    void givenCatAnimal_WhenMakeNoice_ThenReturnMeow() {
        Cats cat = new Cats();
        Assertions.assertEquals("Meow!!", cat.makeNoice());
    }

    @Test
    void givenHorsesAnimal_WhenMakeNoice_ThenReturnNeigh() {
        Horses horses = new Horses();
        Assertions.assertEquals("Neigh!!!", horses.makeNoice());
    }

    @Test
    void givenDucksAnimal_WhenMakeNoice_ThenReturnQuack() {
        Ducks duck = new Ducks();
        Assertions.assertEquals("Quack!!", duck.makeNoice());
    }


    @Test
    void givenPigAnimal_WhenMakeNoice_ThenReturnOink() {
        Pigs pig = new Pigs();
        Assertions.assertEquals("Oink!!", pig.makeNoice());
    }

    @Test
    void givenCowsAnimal_WhenMakeNoice_ThenReturnow() {
        Cows cow = new Cows();
        Assertions.assertEquals("Bow!!", cow.makeNoice());
    }

}
