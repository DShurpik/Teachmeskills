package QAForEveryone.Lesson3;

public class Task3 {
    public static void main(String[] args) {
        /**Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
         на ваш выбор и вывести следующие строки:
         a == b - если переменные равны
         a < b - если переменная a меньше b
         a > b - если переменная b меньше a
         */
        System.out.println("------- Task_1 -------");
        int a = 5;
        int b = 5;
        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
        /** Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения
         переменным на ваш выбор и вывести следующие строки:
         maybe a and b are even - если сумма переменных четная
         some variable is odd - если сумма переменных нечетная
         */
        System.out.println("\n" + "------- Task_2 -------");
        int c = 25;
        int d = 64;
        if ((c + d) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
        /**Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш
         выбор и вывести следующие строки:
         больше 10 - если переменная больше 10
         меньше 100 - если переменная меньше 100
         результат деления на 2 больше 20 - если это соответствует истине
         значение переменной между 5 и 40 включительно - если это правда
         значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
         */
        System.out.println("\n" + "------- Task_3 -------");
        int e = 44;
        System.out.println("number: " + e);
        if (e > 10){
            System.out.println("больше 10");
        } if (e < 100) {
            System.out.println("меньше 100");
        } if (e / 2 > 20 ) {
            System.out.println("результат деления на 2 больше 20");
        } if (e >= 5 && e  <=40){
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
        /** Необходимо вывести числа от 0 до 15.
         */
        System.out.println("\n" + "------- Task_4 -------");
        for (int i = 0; i <= 15; i++){
            System.out.print(i + " ");
        }
        /** Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести
         результат возведения в степень.
         */
        System.out.println("\n" + "\n" + "------- Task_5 -------");
        int f = 5;
        int f1 = 1;
        for (int i = 1; i < 10; i++) {
            int temp = (int) Math.pow(f, i);
            if (temp < 10000) {
                System.out.print(temp + " ");
            }
        }
        System.out.println("\n" + "\n" + "----- task_5 throught do while -----");

        int result = f;

        do {
            System.out.print(result + " ");
            f1++;
            result = result * f;
        } while (result < 10000);
        System.out.println("\n" + "\n" + "----- task_5 throught i = i * 5 -----");

        for ( int i = 1; i < 10000; i = i * f){
            System.out.print(i + " ");
        }
        /**Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
         Реализовать 2 варианта:
         использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
         без использования конструкции if (шаг цикла на ваше усмотрение).
         */
        System.out.println("\n" + "\n" + "------- Task_6 -------");
        for (int i = 40; i <= 60; i++){
            if (i % 4 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 40; i <= 60; i = i + 4){
            System.out.print(i + " ");
        }
    }
}
