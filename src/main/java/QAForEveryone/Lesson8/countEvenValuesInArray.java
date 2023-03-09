package QAForEveryone.Lesson8;

public class countEvenValuesInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,9,0,12,10,4};
        counteven(arr);
    }

    public static void counteven(int[] arr){
        int countEven = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }
        }
        System.out.println(countEven);
    }
}
