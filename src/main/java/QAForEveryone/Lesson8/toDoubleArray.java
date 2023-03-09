package QAForEveryone.Lesson8;

public class toDoubleArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        create(arr);
    }

    public static double[] create(int[] arr){
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[i] = (double)arr[i];
            System.out.print(arr1[i] + " ");
        }
        return arr1;
    }
}
