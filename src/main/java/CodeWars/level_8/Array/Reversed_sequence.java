package CodeWars.level_8.Array;

public class Reversed_sequence {
    public static void main(String[] args) {
        int n = 10;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
