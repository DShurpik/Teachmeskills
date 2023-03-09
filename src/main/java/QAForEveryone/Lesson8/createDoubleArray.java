package QAForEveryone.Lesson8;

public class createDoubleArray {
    public static void main(String[] args) {
        create(1.1, 2.5, 3.7, 4.0, 5.5);
    }


    public static double[] create(double a, double b, double c, double d, double e){
        double[] arr = new double[]{a,b,c,d,e};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
