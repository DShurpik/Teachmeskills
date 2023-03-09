package QAForEveryone.Lesson8;

import java.util.Arrays;

public class createStringArray {
    public static void main(String[] args) {

        strings("It was an apple pie");

    }

    public static String[] strings(String a){
        String [] arr = a.split(" ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
