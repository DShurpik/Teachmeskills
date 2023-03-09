package QAForEveryone.Lesson8;

public class OddIndices {
    public static void main(String[] args) {
        int[] arr = new int[]{-45, 590, 234, 985, 12, 68};

        System.out.println(odd(arr));
    }

    static int[] odd(int[] arr) {


        int count = 0;
        int[] arr1 = new int[count-1];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                count++;
                arr[i] = arr1[i];
            }

        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]);
        }
        return arr1;
    }
}

