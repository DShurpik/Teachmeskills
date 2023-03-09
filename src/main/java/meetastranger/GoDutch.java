package meetastranger;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int countOfGuest = scanner.nextInt();

        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (countOfGuest <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int totalBill = (int) (bill * 0.1 + bill);
            int t = totalBill / countOfGuest;
            System.out.println(t);
        }
    }
}
