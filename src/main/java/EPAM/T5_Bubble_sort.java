package EPAM;

public class T5_Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {20, 91, 64, 75, 19, 26,48, 55, 89};

        bubbleSort(arr);
    }

    static void bubbleSort(int[] array) {
        int comparisonsDone = 0; //кол-во сравнений
        int swapsDone = 0; // кол-во замен
        boolean sorted = false; // отсортирован или нет
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                printArr(array);
                if(array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("No need to change elements " + i + " and " + (i + 1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done " + comparisonsDone);
        System.out.println("Swaps done " + swapsDone);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
