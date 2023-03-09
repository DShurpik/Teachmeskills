package QAForEveryone.Lesson4;

public class Task4_1 {

    public static int maxNumber( int[] a){
        if (a.length > 0){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max){
                    max = a[i];
                }
            }
            return max;
        }
        return - 1;
    }
    public static int sumOfNumbers(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static Object task4(int[] arr){
        if (arr.length > 0){
            int summ = 0;
            for (int i = 0; i < arr.length; i++) {
                summ += arr[i];
            }
            return summ / arr.length;
        }
        return null;
    }
    public static Object task5(int[][] arr){
        if (arr.length > 0){
            int resultSumm = 0;
            for (int i = 0; i < arr.length; i++) {
                resultSumm += sumOfNumbers(arr[i]);
            }
            return resultSumm;
        }
        return null;
    }
    public static Object task6(int[][] arr){
        if (arr.length > 0){
            int max = 0;
            int maxResult = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                max = maxNumber(arr[i]);
                if (max > maxResult){
                    maxResult = max;
                }
            }
            return maxResult;
        }
        return null;
    }
    public static int taskN7(int[][] arr){
        if (arr.length > 0){
            int numberOfElements = arr.length;
            for (int i = 0; i < arr.length; i++) {
                numberOfElements += arr[i].length;
            }
            return numberOfElements;
        }
        return 0;
    }
    public static int[] resultIntArr(String[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.valueOf(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {

        int[] arrayOfTask4 = {12, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(task4(arrayOfTask4));

        int[][] arrayOfTask5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(task5(arrayOfTask5));

        int[][] arrayOfTask6 = {{-1, -2, -3, -4, -5}, {-6, -7, -8, -9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(task6(arrayOfTask6));

        int[][] arrayOfTask7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(taskN7(arrayOfTask7));
    }
}
