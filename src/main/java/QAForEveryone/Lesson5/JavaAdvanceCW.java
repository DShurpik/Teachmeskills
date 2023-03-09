package QAForEveryone.Lesson5;

public class JavaAdvanceCW {
    public static void main(String[] args) {
        Person1 john = new Person1("John",'M', 30);
        Person1 jane = new Person1("Jane",'F', 60);

        john.mother = jane;
        john.setFather("Jake", 'M', 66);

        john.printName();
        jane.printName();

        jane.setMother("Mary", 'F', 75);
        jane.setFather("Jake", 'M', 66);

        System.out.println("name "+jane.name+" sex "+jane.sex+" age "+ jane.age+" mother "+john.mother.name+" father "+john.father.name);
        System.out.println("name "+john.name+" sex "+john.sex+" age "+ john.age+" mother "+jane.mother.name+" father "+jane.father.name);

    }
}

class Person1{
    public String name;
    public char sex;
    public int age;

    public Person1 mother;
    public Person1 father;

    Person1(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void printName(){
        System.out.println(this.name);
    }

    public void setFather(String name, char sex, int age){
        this.father = new Person1(name, sex, age);
    }

    public void setMother(String name, char sex, int age){
        this.mother = new Person1(name, sex, age);
    }
}
