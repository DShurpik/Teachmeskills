package QAForEveryone.Lesson8;

public class CreateArray {
    public static void main(String[] args) {
        createArr(5);
        createArr(10);
    }

    public static void createArr(int k){
        int[] arr = new int[k];
        for (int i = 0; i < k; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

}
