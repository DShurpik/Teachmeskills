package meetastranger;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        /** Сдвигает все элементы в данном массиве вправо на 1 позицию.
         В этом случае последний элемент массива становится первым.*/
        if (array.length == 0){
            return;
        }
        int ind = array.length-1;
        int temp = array[ind];
        for (int i = ind; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    static void cycleSwap(int[] array, int shift) {
        /** Сдвигает все элементы в заданном массиве вправо на shift позиций.
         Гарантируется, что значение сдвига неотрицательное и не больше длины массива. */
        int[] arr2 = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = arr2[(array.length + i - shift) % array.length];
        }
    }
}
