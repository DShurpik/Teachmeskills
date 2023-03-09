package QAForEveryone.Lesson8;

public class toIntArray {
    public static void main(String[] args) {
        double[] arr = new double[]{1.1, 2.5, 3.7, 4.0, 5.5};
        create(arr);
    }

    public static int[] create(double[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = (int) arr[i];
            System.out.print(arr1[i] + " ");
        }
        return arr1;
    }
}
