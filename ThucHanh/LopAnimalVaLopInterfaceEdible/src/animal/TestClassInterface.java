package animal;

import fruit.Apple;
import fruit.Fruit;
import fruit.Orangle;

public class TestClassInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]=new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orangle();
        fruits[1]= new Apple();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
