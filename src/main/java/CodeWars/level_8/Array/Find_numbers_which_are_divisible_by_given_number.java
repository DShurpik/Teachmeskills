package CodeWars.level_8.Array;

import java.util.Arrays;

public class Find_numbers_which_are_divisible_by_given_number {
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,4,5,6};
        int divider = 2;
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arr[j] = numbers[i];
                j++;
            }
        }


        int[] arr2 = Arrays.stream(numbers)
                .filter(number -> number % divider == 0)
                .toArray();

        for(Integer integer : arr2) {
            System.out.print(integer + "   ");
        }
    }


}
