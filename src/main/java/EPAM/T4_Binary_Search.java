package EPAM;

public class T4_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {19, 20, 26, 48, 55, 64, 75, 89, 91};
        int key = 26;
        int position = binarySearch(arr, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] array, int key) {
        int posision = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key found");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("Cut left half");
                left = middle + 1;
            }

            if (array[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1;
            }
        }
        return -1;
    }
}
