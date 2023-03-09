package QAForEveryone.Lesson8;

public class IsPositiveNumber {
    public static void main(String[] args) {
        isTrue(555);
        isTrue(0);
        isTrue(-555);

    }

    public static boolean isTrue(int i){
        if(i >= 0){
            System.out.println(true);
            return true;
        } else System.out.println(false);
            return false;
    }

}
