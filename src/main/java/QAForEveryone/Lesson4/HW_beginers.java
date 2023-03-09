package QAForEveryone.Lesson4;

public class HW_beginers {

    public static double k = 20;
    public static double l = 10;

    public static void main(String[] args) {
        temperatureCinF(32);
        checkAlgoritm(6, 9);
        checkAlgoritm(25, 5);
        checkAlgoritm(43, 23);

        avgSpeed(270, 5);


        System.out.println(task14(k, l, "k", "l"));



    }

    public static double temperatureCinF(int C){
        /** Напишите метод, который примет на вход температуру в Цельсиях, и распечатает результат температуры
         * в Цельсиях и в Фаренгейтах.*/
        double F = (C * 1.8) + 32;
        System.out.println(F);
        return F;
    }

    public static void checkAlgoritm(int a, int b){
        /* Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа, которые делятся на 3 без
        остатка, и вычитает числа, которые делятся на 5 без остатка. ПРограмма выводит на печать результат вычислений.
        Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное, программа умножает
        результат действия на (-1). ПРограмма выводит на печать результат вычислений.
        Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
        */
        if(a % 3 == 0 && b % 3 == 0){
            System.out.println(a + b);
        } else if (a % 5 == 0 && b % 5 == 0){
            System.out.println(a - b);
        } else if (a % 2 == 0 && b % 2 == 0){
            System.out.println(a * b);
        } else if (a < 0 || b < 0){
            System.out.println((a * b) * -1);
        } else {
            System.out.println("error about the inability to perform actions");
        }
    }

    public static String task14(double d1, double d2, String m1, String m2){
        double result1 = d1 / d2;
        double result2 = d1 % d2;

        //System.out.println("Результат деления " + m1 + " на " + m2 + " = " + result1 + " а остаток от деления  = " + result2);
        String result = "Результат деления " + m1 + " на " + m2 + " = " + result1 + " а остаток от деления  = " + result2;
        return result;
    }

    public static void avgSpeed(double distance, double time){
        System.out.println("avg speed: distance " + distance + " mile and time " + time + " hours = " + distance / time + " m/h");
    }
}
