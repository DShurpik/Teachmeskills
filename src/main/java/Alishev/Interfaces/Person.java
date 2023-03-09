package Alishev.Interfaces;

public class Person implements Info{
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void printInfo(){
        System.out.println(name);
    }
}
