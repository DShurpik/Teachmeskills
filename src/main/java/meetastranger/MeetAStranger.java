package meetastranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        //Write a program, which read a String from System.in and print "Hello, <input string>"
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Hello, " + string);
    }
}
