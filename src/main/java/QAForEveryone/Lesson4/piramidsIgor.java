package QAForEveryone.Lesson4;

public class piramidsIgor {
    public static void main(String[] args) {
        for (int i = 9; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println("");
        }
        System.out.println("-".repeat(50));

        for (int i = 9; i >= 0 ; i--) {
            System.out.print("  ".repeat(9 - i));
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("-".repeat(50));

        for (int i = 9; i >= 0; i--) {
            System.out.print("  ".repeat(9 - i));
            for (int j = i ; j >= -i; j--) {
                System.out.print(Math.abs(j) + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print("  ".repeat(9 - i));
            for (int j = i ; j >= -i; j--) {
                System.out.print(Math.abs(j) + " ");
            }
            System.out.println("");
        }
    }
}
