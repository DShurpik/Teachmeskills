package QAForEveryone.Lesson4;

import java.util.Arrays;

public class StringLesson {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.printf("x = %d | y = %d | x == y is %b", x, y, x == y); // подстановка в строку разных значений

        String str = "Hello world!";
        System.out.println(str.charAt(6));// поиск по тндексу в строке
        System.out.println(str.indexOf('l')); // поиск индекса по значению
        System.out.println(str.contains("orl"));// что есть буква или выражение
        System.out.println(String.join(":","1","2","3","4","5")); // создание строки

        String rs = "0 1 2 3 4 5 6 7 8 9";
        String[] stringArr = rs.split(" ");// раскладываем по пробелам и создаем массив
        System.out.println("string[] = " + Arrays.toString(stringArr));

        String[] words2 = rs.split(" ");
        int[] numbers = new int[10];
        int count = 0;

        for(String number : words2){
            numbers[count++] = Integer.parseInt(number);
        }
        System.out.println("int[]    = " + Arrays.toString(numbers));
        }
    }
