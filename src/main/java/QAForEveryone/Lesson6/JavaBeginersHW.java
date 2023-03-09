package QAForEveryone.Lesson6;

public class JavaBeginersHW {
    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task7();

        task8();

        task9();

        task10(1,2,15);

        task11('A', 'h');

        task12(12);

        task13(10);

        task14(); // ????????????????????

        task15();

        task16();

        task17(1, 3, 50);

        task18(0, 10, 5);


    }

    public static void task1(){
        System.out.println("Распечатать последовательность чисел от 0 до 9 включительно.");
        for (int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
    }

    public static void task2(){
        border();
        System.out.println("Распечатать последовательность чисел от 10 исключительно до 0 включительно.");
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
    }

    public static void task3(){
        border();
        System.out.println("Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.");
        for (int i = 50; i <= 55; i = i + 2){
            System.out.print(i + " ");
        }
    }

    public static void task4(){
        border();
        System.out.println("Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)");
        for (int i = 327; i >= 300; i--){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task5(){
        border();
        System.out.println("Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1");
        for (double i = 12.0; i <= 13.0; i = i + 0.1){
            System.out.printf("%.1f" + " ", i);
        }
    }

    public static void task6(){
        border();
        System.out.println("Распечатать последовательность четных чисел от 215 до 237 включительно");
        for (int i = 215; i <= 237; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task7(){
        border();
        System.out.println("Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.");
        for (int i = 7; i <= 14; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task8(){
        border();
        System.out.println("Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.");
        for (int i = -32768; i <= 32767; i++){
            if(i % 15001 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task9(){
        border();
        System.out.println("Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.");
        for (int i = -10; i <= 34; i++){
            if(i == 0){
                System.out.print("ZERO ");
            } else if(i % 11 == 0){
                System.out.print(i + " " + "кратно 11|  ");
            } else if( i % 12 == 0){
                System.out.print(i + " " + "кратно 12|  ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void task10(int start, int step, int end){
        border();
        System.out.println("Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.");
        for (int i = start; i <= end; i = step + i){
            System.out.print(i + " ");
        }
    }

    public static void task11(char n, char m){
        border();
        System.out.println("Написать метод, который принимает на вход параметры n и m типа char, и выводит на печать последовательность букв английского алфавита в промежутке между значениями n и m включительно.");
        for (int i = n; i <= m; i++){
            System.out.print( (char) i + " ");
        }
    }

    public static void task12(int l){
        border();
        System.out.println("Написать метод, который принимает параметр  и печатает  последовательность четных чисел от нуля. Длина последовательности = L");
        for (int i = 0; i < l * 2; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task13(int l){
        border();
        System.out.println("Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно");
        int f = 2;
        for (int i = 1; i <= l; i++) {
            int temp = (int) Math.pow(f, i);
            System.out.print(temp + " ");
        }
    }

    public static void task14(){
        border();
        System.out.println("Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.");
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                System.out.print(i + "" + i);
            }
        }
    }

    public static void task15(){
        border();
        System.out.println("Написать метод, который генерирует  последовательность чисел:" +
                "0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5" +
                "Метод формирует строку из сгенерированных значений, и выводит результат единожды на печать. ПРотестировать этот метод.");
        for (int i = 0; i > -6; i--){
            System.out.print(Math.abs(i) + " " + i + " ");
        }
    }

    public static void task16(){
        border();
        System.out.println("Распечатать последовательность чисел:" +
                "0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25");
        for (int i = 0; i <= 25; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task17(int n, int m, int l){
        border();
        System.out.println("Написать метод, который принимает параметры n, m, , и печатает последовательность нечетных чисел,  начиная с числа n, с шагом m,  длина последовательности  .  ");
        for(int i = n; i <= l ; i = i + m){
            if( i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void task18(int n, int m, int l){
        border();
        System.out.println("Написать метод, который принимает на вход параметры n, m,  и генерирует последовательность случайных целых чисел в промежутке от n до m  включительно. Длина последовательности - l. Вывести результат на печать");
        for (int i = n; i < m ; i++ ){
            System.out.print( i + " ");
        }
    }

    public static void border(){
        System.out.println("");

    }


}

