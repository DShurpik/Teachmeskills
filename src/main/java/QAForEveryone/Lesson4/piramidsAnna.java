package QAForEveryone.Lesson4;

public class piramidsAnna {
    public static void main(String[] args) {
        String digits = "0 1 2 3 4 5 6 7 8 9";
        //Task 1

        for (int i = digits.length(); i > 0; i = i - 2) {
            System.out.println(digits.subSequence(0, i));
        }
        //Task 2

        for (int i = digits.length(); i > 0; i -= 2) {
            System.out.print(" ".repeat(digits.length() - i));
            System.out.println(digits.subSequence(0, i));
        }
        //Task 3

        StringBuilder digits2 = new StringBuilder(digits);
        digits2.reverse().append(digits.substring(1));
        for (int i = 0, j = digits2.length(); j > digits2.length()/2; i = i + 2, j = j - 2) {
            System.out.print(" ".repeat(digits2.length() - j));
            System.out.println(digits2.subSequence(i, j));
        }
    }
}
