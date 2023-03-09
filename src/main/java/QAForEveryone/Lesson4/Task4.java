package QAForEveryone.Lesson4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /** Задача №1
         Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести сумму всех значений массива.
         */
        System.out.println("----- task_1 -----");
        int[] array1 = new int[]{9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
        }

        for (int i: array1){
            sum1 = sum1 + i;
        }

        System.out.println("sum all values = " + sum1);

        System.out.println("sum all values = " + sum);

        System.out.println("sum all values = " + Arrays.stream(array1).sum());

        /**Задача №2
         Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести максимальное значение массива.
         */
        System.out.println("----- task_2 -----");
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = array2[0];
        for (int i = 0; i < array2.length; i++){
            if(array2[i] > maxValue){
                maxValue = array2[i];
            }
        }
        System.out.println("Max value = " + maxValue);

        System.out.println("Max value = " + Arrays.stream(array2).max().getAsInt());

        /** Задача №3
         Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести минимальное значение массива.
         */
        System.out.println("----- task_3 -----");
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = array3[0];
        for (int i = 0; i < array3.length; i++){
            if(array3[i] < minValue){
                minValue = array3[i];
            }
        }
        System.out.println("Min value = " + minValue);

        System.out.println("Min value = " + Arrays.stream(array3).min().getAsInt());

        /** Задача №4
         Дан массив:
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         необходимо вывести среднее арифметическое всех значений массива.
         */
        System.out.println("----- task_4 -----");
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int avgSum = 0;
        for (int i = 0; i < array4.length; i++){
            avgSum = avgSum + array4[i];
        }
        System.out.println("avg sum = " + avgSum/array4.length);

        System.out.println("avg sum = " + Arrays.stream(array4).average().getAsDouble());

        /** Задача №5
         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести сумму элементов массива.
         */
        System.out.println("----- task_5 -----");


        int[][] array5 = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9},
                          {-1, -2, -3, -4},
                           {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++){
            for (int j = 0; j < array5[i].length; j++){
                sum5 = sum5 + array5[i][j];
            }
        }
        System.out.println("sum all element multi array = " + sum5);
        /** Задача №6
         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести максимальное значение массива.
         */
        System.out.println("----- task_6 -----");
        int[][] array6 = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9},
                          {-1, -2, -3, -4},
                           {-5, -6}};
        int maxValue1 = array6[0][0];
        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6[i].length; j++){
                if (array6[i][j] > maxValue1){
                    maxValue1 = array6[i][j];
                }
            }
        }
        System.out.println("max value multi array = " + maxValue1);
        /** Задача №7
         Дан массив:
         int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         необходимо вывести количество элементов в массиве.
         */
        System.out.println("----- task_7 -----");
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int countElements = 0;
        for (int i = 0; i < array7.length; i++){
            for (int j = 0; j < array7[i].length; j++){
                countElements++;
            }
        }
        System.out.println("counts elements = " + countElements);

        int countForEach = 0;
        for (int[] array : array7){
            for (int i : array){
            countForEach++;
            }
        }
        System.out.println("counts elements = " + countForEach);
    }
}
