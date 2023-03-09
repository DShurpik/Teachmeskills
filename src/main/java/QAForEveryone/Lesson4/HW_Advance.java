package QAForEveryone.Lesson4;

public class HW_Advance {

    /** Необходимо написать 4 метода:
     сложение 2х чисел
     вычитание 2х чисел
     умножение 2х чисел
     деление 2х чисел
     */

    public static int a = 10;
    public static int b = 5;

    public static void main(String[] args) {
        System.out.println("a + b = " + addition(a, b));
        System.out.println("a + b = " + add(10, 5));

        System.out.println("a - b = " + subtraction(a, b));

        System.out.println("a * b = " + multiplication(a, b));

        System.out.println("a / b = " + division(a, b));
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }
}