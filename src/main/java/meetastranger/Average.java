package meetastranger;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input

        int value = scanner.nextInt();
        int sum = 0;
        int count = 0;
        while(value != 0){
            sum += value;
            count++;
            value = scanner.nextInt();
        }
        System.out.println(sum/count);

    }

}