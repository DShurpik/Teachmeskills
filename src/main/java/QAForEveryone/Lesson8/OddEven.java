package QAForEveryone.Lesson8;

public class OddEven {
    public static void main(String[] args) {

        System.out.println(oddEven(-345));
        System.out.println(oddEven(0));
        System.out.println(oddEven(222222 ));

    }
    public static String oddEven(Integer value){
        if(value % 2 == 0){
            return "Even";
        } else return "Odd";
    }
}
