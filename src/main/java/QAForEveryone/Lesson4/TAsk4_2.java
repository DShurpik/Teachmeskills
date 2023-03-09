package QAForEveryone.Lesson4;

import java.util.Arrays;

public class TAsk4_2 {

    private static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    private static int[] array2 = {};

    public static void main(String[] args) {

        System.out.println("max after method1 = " + maxIntArrayMethod1(array2));
        System.out.println("max after method2 = " + maxIntArrayMethod2(array));



        String h = "one two three four five";
        String[] h1 = h.split(" ");
        System.out.println(Arrays.toString(h1));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (j + 1));
            }
            System.out.println("");
        }


    }

    private static int maxIntArrayMethod1(int[] array){
        int max = 0;
        if(array.length > 0){
            max = array[0];
        }
        for (int element : array){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

    private static int maxIntArrayMethod2(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
