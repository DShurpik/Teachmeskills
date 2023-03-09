package QAForEveryone.oop.inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        /** Создаем объект класса Person и заподняем параметрами*/
        Person person1 = new Person("John", "30", "Director", "15000");

        Person person2 = new Person("Jack", "31", "Worker", "16000");

        /** Создаем мапу и присваиваем знаения */
        Map<String, String> str = new HashMap<>();
        str.put("name", person1.getName());
        str.put("age", person1.getAge());
        str.put("work", person1.getWork());
        str.put("salary", person1.getSalary());

        Map<String, String> str1 = new HashMap<>();
        str1.put("name", person2.getName());
        str1.put("age", person2.getAge());
        str1.put("work", person2.getWork());
        str1.put("salary", person2.getSalary());

        List<Map<String, String>> personList = new ArrayList<>();
        personList.add(str);
        personList.add(str1);

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).get("age"));
        }


    }
}
class Person {
    public Person(String name, String age, String work, String salary) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
    }

    private String name;
    private String age;
    private String work;
    private String salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

