package Alishev.AbstractClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(); //Сущности которые существуют и наследуются от animal
        Dog dog = new Dog();

        dog.makeSound();
        cat.makeSound();

        dog.eat();
        cat.eat();

    }
}
