package Alishev.Interfaces;

public class Service1 {
    public static void main(String[] args) {

        Info info1 = new Animal(1);
        Info info2 = new Person("Jack");

        Animal animal1 = new Animal(2);
        Person person1 = new Person("John");

        outPutInfo(info1);
        outPutInfo(info2);

        outPutInfo(animal1);
        outPutInfo(person1);
    }

    public static void outPutInfo(Info info){ // В параметр принимает нечто, что реализует интерфейс info
        info.printInfo();
    }
}
