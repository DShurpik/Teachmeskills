package QAForEveryone.Lesson8;

public class negativeArr {
    public static void main(String[] args) {


       int[] arr = new int[]{20,25,14,13,19,9,4};
        summ(arr);


    }

    static void summ(int[] arr){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            avg = sum/arr.length;

        }
        System.out.println(avg);
    }
}

