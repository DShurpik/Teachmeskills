package EPAM;

public class T3_Search_On_Arrr {
    public static void main(String[] args) {
        int[] arr = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(min);
        System.out.println("Min index = " + minIndex);

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println("Max index = " + maxIndex);
    }
}
