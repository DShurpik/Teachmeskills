package meetastranger;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; ; i++){
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            } else {
               if (value > max) {
                   max = value;
               }            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
