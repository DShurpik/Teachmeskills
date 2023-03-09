package QAForEveryone.Lesson8;

public class GivenCondition {
    public static void main(String[] args) {
        following(63);
        following(110);
        following(70);
        following(90);
    }

    public static void following(int m){
        if(m % 7 == 0 && m % 9 == 0){
            System.out.println("Good Number");
        } else if(m % 9 == 0){
            System.out.println("Bad Number");
        } else if(m % 11 == 0){
            System.out.println("Poor Number");
        } else System.out.println(-1);
    }
}
