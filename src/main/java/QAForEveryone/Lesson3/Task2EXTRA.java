package QAForEveryone.Lesson3;

import java.util.Arrays;

public class Task2EXTRA {

    public static String[] array = {
            "Trying to figure out who I am",
            "Or who I'm supposed to be",
            "Feel good about where I stand",
            "So I can make the most of me I'm",
            "Coming back down from space"
    };

    public static void main(String[] args) {

        secondMethod(firstMethod(array));
    }

    public static String firstMethod(String[] arr) { // первый метод приводит массив к строке, выкидывает символы и приводит к набору букв
        String array = Arrays.deepToString(arr);
        String array1 = array.replaceAll(",", "").replaceAll("'", "").replaceAll(" ", "");
        String array2 = array1.toLowerCase();



        System.out.println(array2);
        return array2;
    }

    public static void secondMethod(String str) { // считает количество
        String st1 = str;
        int count = 0;

        for (int i = 0; i < st1.length(); i++) {
            count++;
        }
        System.out.println(count + " count of letter");

        int[] countOfValue = new int[st1.length()];
        for (int j = 0; j < st1.length(); j++) {

        }
    }
}