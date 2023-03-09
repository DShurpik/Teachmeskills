package CodeWars.level_8.Array;

import java.util.stream.*;
import java.util.Arrays;

public class Array_plus_array {
    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6})); //15
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }

    public static int arrayPlusArray1(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
