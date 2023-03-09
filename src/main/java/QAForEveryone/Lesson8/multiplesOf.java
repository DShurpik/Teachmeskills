package QAForEveryone.Lesson8;

public class multiplesOf {
    public static void main(String[] args) {
        multy(3);
    }


    static int[] multy(int number){
        int[] arr = new int[11];
        for (int i = 0; i <= 10; i++){
            arr[i] = i * number;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        return arr;
    }
}
