package meetastranger;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int seconds = scanner.nextInt();
        //System.out.println(timeToString(seconds));
        System.out.println(timeToString(61000));

    }

    public static String secToTime(int str) {
        int sec = str;
        int s = sec % 60;
        int m = (sec / 60) % 60;
        int h = (sec / (60 * 60)) % 24;
        return String.format("%d:%02d:%02d", h, m, s);
    }

    public static String timeToString(int seconds) {
        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        seconds = seconds - h * 3600 - m * 60;
        h = h % 24;

        return String.format("%d:%02d:%02d", h, m, seconds);
    }
}
