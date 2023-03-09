package meetastranger;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner1 = new Scanner(System.in);
        int count = scanner1.nextInt();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                String name = scanner1.next();
                name = name + scanner1.nextLine();
                System.out.println("Hello, " + name);
            }
        } else if (count == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }

    }
}
