package QAForEveryone.Lesson4;

public class MethodReboot {

    static String a = "Java!";
    static int b = 30;

    public static void main(String[] args) {
        print();
        print("John");
        print();
        print(100);
        print();
        print(a);
        print();
        print(b);
        print();
        print("Hello", 10);
    }

    public static void print(){
        System.out.println("-----");
    }

    public static void print(String i){
        String j = "Hello " + i;
        System.out.println(j);
    }

    public static void print(int i){
        int j = i + 10;
        System.out.println(j);
    }

    public static void print(String i, int j){
        String k = i + "!";
        int g = j * j;
        System.out.println("String: " + k + " int: " + g);
    }
}