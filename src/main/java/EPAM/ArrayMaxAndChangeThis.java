package EPAM;

public class ArrayMaxAndChangeThis {
    public static void main(String[] args) {
        /** Задача: необходимо найти максимальное значение в массиве и заменить отрицательные элементы этого массива на него.*/

        int[] array = { 5, 10, 0, -5, 16, -2 };
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
            System.out.println("array[" + i + "]= "+ array[i]);
        }
    }
}
