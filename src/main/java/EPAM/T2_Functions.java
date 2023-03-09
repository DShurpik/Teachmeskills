package EPAM;

public class T2_Functions {
    public static void main(String[] args) {
        int[] array = {2, 9, 9, 7};
        printArray(array);
        System.out.println("\n" + sum(2.5, 3.5));

    }
    static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    static void printArray(int[] arrToPrint) {
        for (int i = 0; i < arrToPrint.length; i++) {
            System.out.print(arrToPrint[i] + "  ");
        }
        }
    }

