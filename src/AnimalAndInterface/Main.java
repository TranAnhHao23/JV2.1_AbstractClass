package AnimalAndInterface;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[1] = new Chicken();
        animals[0] = new Tiger();
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
            if (animals[i] instanceof Chicken){
                Edible edible = (Chicken) animals[i];
                System.out.println(edible.howtoEat());
            }

        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howtoEat());
        }

    }
}
