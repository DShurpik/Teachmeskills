package QAForEveryone.Lesson4.Human;

public class Main {
    public static void main(String[] args) {
        Person dima = new Person();
        dima.name = "Dima";
        dima.gender = "Male";
        dima.age = 30;

        System.out.printf("My name is %s, I am %s, I am %d old\n", dima.name,dima.gender, dima.age);

        System.out.println("My name is " + dima.name + "," + " I am " + dima.gender + "," + " I am " + dima.age + " old");

        dima.printInfo();
    }


}
