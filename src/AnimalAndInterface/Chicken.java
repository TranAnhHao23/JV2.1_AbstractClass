package AnimalAndInterface;


public class Chicken extends Animal implements Edible {
    @Override
    void makeSound() {
        System.out.println("chiep chiep");
    }

    @Override
    public String howtoEat() {
        return "could be fired";
    }
}
