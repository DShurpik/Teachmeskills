package QAForEveryone.Lesson3;

import java.util.Arrays;
import java.util.Collections;

public class ArrayStrExtraTask2 {
    public static void main(String[] args) {
        //отсортировать массив строк по возрастанию:
        String[] strings = {"hello", "you", "study", "java", "tommorow"};
        strings = Arrays.stream(strings).sorted().toArray(String[] :: new);
        System.out.println(Arrays.toString(strings));
        //отсортировать массив строк по убыванию:
        String[] s = { "sort", "string", "array" };
        s = Arrays.stream(s).sorted(Collections.reverseOrder())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(s));


        sortByAlphabet();
        countAllChars();

    }
    public static void sortByAlphabet() {
        System.out.println("----------------Extra Task 2----------------");
        String[] array = {
                "Trying to figure out who I am",
                "Or who I’m supposed to be",
                "Feel good about where I stand",
                "So I can make the most of me I’m",
                "Coming back down from space"
        };
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
    public static void countAllChars() {
        System.out.println("----------------Extra Task 3----------------");
        final int MAX_CHAR = 256;
        String[] array = {
                "Trying to figure out who I am",
                "Or who I'm supposed to be",
                "Feel good about where I stand",
                "So I can make the most of me I'm",
                "Coming back down from space"
        };

        String arrayS = Arrays.deepToString(array);
        System.out.println(arrayS);

        String[] arrayTemp = arrayS.split(" ");
        System.out.println(Arrays.toString(arrayTemp));

        for (String s : arrayTemp){
            System.out.print(s);
        }


        int[] count = new int[MAX_CHAR];
        for (String s : array) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 32 || s.charAt(j) == 39) {
                    continue;
                }
                count[s.charAt(j)]++;
            }
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println(String.format("Number of Occurrence of %s is: %d", (char) i, count[i]));
            }
        }
    }
}
