package meetastranger;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = (double) scanner.nextDouble();
        double b = (double) scanner.nextDouble();
        double c = (double) scanner.nextDouble();

        double d = Math.pow(b , 2) - 4 * a * c;

        if (d > 0) {
            double x1, x2;
            x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
            x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else if (d < 0){
            System.out.println("no roots");
        }


    }

}