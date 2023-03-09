package QAForEveryone.Lesson5;

import java.util.Arrays;

public class JavaAdvanceHW {
    public static void main(String[] args) {
        System.out.println("count of true = " + countSheeps(array1)); // про овец

        System.out.println("i x2 = " + doubleInteger(10)); // умножаем на 2

        System.out.println(isLove(10, 10)); // про любовь

        System.out.println(numberToString(100)); // от числа к строке

        System.out.println(findSmallestInt(arr2)); // минимум в массиве

        System.out.println(countingSheep(10)); // считаем овец





    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i])
                count++;
        }
        return count;
    }

    public static Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i*2;
    }

    public static boolean isLove(int flower1, int flower2) {
        if ((flower1 + flower2) % 2 != 0){
            return true;
        } else return true;
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        String str = Integer.toString(num);
        return str;
    }

    public static int findSmallestInt(int[] args) {
        int minValue = args[0];
        for (int i = 0; i < args.length; i++) {
            if (minValue > args[i]){
                minValue = args[i];
            }
        }
        return minValue;
    }

    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++){
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }

    public static int[] arr = {34, 15, 88, 2};
    public static int[] arr2 = {78,56,232,12,11,43};
}
