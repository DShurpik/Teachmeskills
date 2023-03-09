package Alishev.Interfaces;

public class Service {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        animal1.sleep();
        animal1.printInfo();

        Person person1 = new Person("John");
        person1.sayHello();
        person1.printInfo();

        // т.к классы person и animal реализуют один интерфейс, и мы можем ссылать тип объекта на другие классы

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");

        info1.printInfo(); //
        info2.printInfo();
    }
}
