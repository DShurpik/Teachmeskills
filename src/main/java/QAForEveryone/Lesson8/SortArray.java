package QAForEveryone.Lesson8;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        sort1(arr1);
        sort2(arr1);

    }

    public static void sort1(int[] arr){
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort2(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
