package QAForEveryone.Lesson8;

public class BiggerValue {
    public static void main(String[] args) {
        bigValue(3333, 9999);

        bigValue(10, 5);
    }

    public static int bigValue(int a, int b){
        if(a > b){
            System.out.println(a);
            return a;
        } else System.out.println(b);
        return b;
    }

}
