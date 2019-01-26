package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,
                1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20,
                2, 4, 1, 20, "long silky");

        Fish fish = new Fish("Tuna", 5, 2, 2, 2,
                2);

        // start calling methods that have been in-heritted
        //dog.eat();
        //dog.chew();
        //dog.walk();
        //dog.run();
        fish.move(8);
    }
}
