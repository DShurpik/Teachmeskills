package EPAM;

public class ArrayChangeSize {
    public static void main(String[] args) {
        int[] arr = new int[7];
        // переобъявляем ссылку
        arr = new int[42];
    }
}
