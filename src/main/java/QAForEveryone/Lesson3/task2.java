package QAForEveryone.Lesson3;

public class task2 {
    public static void main(String[] args) {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // сумма от 1 до 10
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum = sum + i;
            System.out.print(sum + " ");
        }
    }
}
