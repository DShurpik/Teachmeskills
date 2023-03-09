package QAForEveryone.Lesson4;

public class piramids {
    public static void main(String[] args) {
        // Task1
        //hwT1v1();
        //hwT1v2();
        //strBuilderT1();

        //hwT2();

        hwT3();

        //hw();
    }

    public static void hwT1v1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print((10 - j) + " ");
            }
            System.out.println("");
        }
    }
    public static void hwT1v2(){
        for (int i = 9; i >= 0; i--){// двигаемся от 9 к 0
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void hw(){
        int num1 = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = j; i >= 0; i--) { // печать строки
                System.out.print((num1 + i) + " ");
            }
            System.out.println(" ");
        }
    }
    public static void strBuilderT1(){
        StringBuilder stringBuilder = new StringBuilder("0123456789");
        for(int i = 0; i < 10; i++){
            System.out.println(stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static void hwT2(){
        for (int i = 9; i >= 0; i--){// двигаемся от 9 к 0
            for (int j = 0; j < 9 - i; j++){// цикл который печатает и увеличивает пробелы
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void hwT3(){
        for (int i = 9; i >= 0; i--){
            for (int j = 0; j < 9 - i; j++){
                System.out.print("  ");
            }
            for (int j = i; j >= 0 ; j--){
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}