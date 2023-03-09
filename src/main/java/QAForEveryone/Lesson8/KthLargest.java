package QAForEveryone.Lesson8;

import java.util.Arrays;

public class KthLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 7, 13, 5, 2, 9, 4, 12};
        kth(arr, 5);


    }

    public static void kth(int[] arr, int k){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int lenght = arr.length;
        int a = arr[lenght - k];
        System.out.println(a);

    }
}
