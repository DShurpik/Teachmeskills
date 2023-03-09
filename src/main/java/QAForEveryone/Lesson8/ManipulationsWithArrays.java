package QAForEveryone.Lesson8;

public class ManipulationsWithArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,9,0,12,10,4};

        sumArr(arr, 42);
    }

    public static boolean sumArr(int[] arr, int number){
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++){
            sumArr = sumArr + arr[i];
        }
        System.out.println(sumArr);
        if(sumArr > number){
            System.out.println(true);
            return true;
        } else System.out.println(false);
        return false;
    }
}
