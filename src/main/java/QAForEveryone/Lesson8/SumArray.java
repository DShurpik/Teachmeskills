package QAForEveryone.Lesson8;

public class SumArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 5};
        sum(arr1);

        int[] arr2 = new int[]{-7, -3};
        sum(arr2);

    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    };

}
