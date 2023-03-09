package QAForEveryone.Lesson8;

public class multiplуArrayByNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        multi(arr, 3);

    }

    public static int[] multi(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * k;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
