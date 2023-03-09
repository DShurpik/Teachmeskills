package meetastranger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if(i == 0) {
                if (array[i] > array[i + 1]) {
                    continue;
                } else {
                    list.add(array[0]);
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    continue;
                } else {
                    list.add(array[array.length - 1]);
                }
            } else {
                if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                    continue;
                } else {
                    list.add(array[i]);
                }
            }
        }
        int [] arrLocal = new int[list.size()];
        for (int i = 0; i < arrLocal.length; i++) {
            arrLocal[i] = list.get(i);
        }
        return arrLocal;

    }
}
