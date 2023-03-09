package QAForEveryone.Lesson8;

public class AreNumbersEqual {
    public static void main(String[] args) {

        equalNumber(89, 89);
        equalNumber(-89, 89);
        equalNumber(89, -89);


    }

    public static int equalNumber(int a, int b){
        if(a == b){
            System.out.println(0);
            return 0;
        } else if (a < b){
            System.out.println(-1);
            return -1;
        } else System.out.println(1);
        return 1;
    }

}
