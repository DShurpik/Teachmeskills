package meetastranger;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder

        Scanner scanner = new Scanner(System.in);
        int countOfPeople = scanner.nextInt();
        int countOfPizza = scanner.nextInt();
        int sum = 0;
        int total_count = 0;
        do {
            total_count = total_count + countOfPizza;
            sum++;
        }
        while (total_count % countOfPeople != 0);
        System.out.println(sum);

    }
}
