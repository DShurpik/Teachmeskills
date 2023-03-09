package QAForEveryone.Lesson5;

import java.util.Calendar;

public class JavaAdvanceHW1 {
    public static void main(String[] args) {
        Person john = new Person();// task 7
        john.setName("John");
        john.setAge(30);
        john.setSex('M');
        john.getName();

        Person jane = new Person();// task 7
        jane.setName("Jane");
        jane.setAge(30);
        jane.setSex('F');
        System.out.println(jane.getYearOfBirth());// years default
        jane.getName();

        Person max = new Person(1990);// task 8_1
        max.printYearsOfBird();

        Person mike = new Person(1979);// task 8_3
        System.out.println(mike.getAge());



    }
}


class Person{
    private String name;
    private int age;
    private char sex;
    private int yearOfBirth = 1980;

    Person(){}


    Person(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public void getName(){
        if(sex == 'M'){
            System.out.println("Mr. " + name);
        } else if(sex == 'F'){
            System.out.println("Ms. " + name);
        }
    }

    public void printYearsOfBird(){
        System.out.println(yearOfBirth);
    }

    public int getAge(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - yearOfBirth;
    }
}