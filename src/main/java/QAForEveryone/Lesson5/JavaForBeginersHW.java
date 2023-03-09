package QAForEveryone.Lesson5;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class JavaForBeginersHW {
    public static void main(String[] args) {
        printTCNumber();
        int numberOfDay = 7;
        String expectedResult = "Sunday";
        System.out.print(dayOfWeekV1(numberOfDay) + " | " + dayOfWeekV2(numberOfDay) + " ");
        System.out.println(verifyEquals(expectedResult, dayOfWeekV1(numberOfDay)));

        printTCNumber();
        int age1 = 20;
        int age2 = 40;
        int age3 = 60;
        int average = 40;
        System.out.println(verifyEquals(average, avgOldFamily(age1, age2, age3)));

        printTCNumber();
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;

        int expRes = 3;

        System.out.println(verifyEquals(expRes, minValue(k, l)));
        printTCNumber();
        System.out.println(verifyEquals(expRes, minValue(k, l, m)));
        printTCNumber();
        System.out.println(verifyEquals(expRes, minValue(k, l, m, n)));

        printTCNumber();
        double t1 = 21;
        double t2 = 39;
        double t3 = 39;
        double t4 = 39;
        double t5 = 39;
        double expectRes = 36;

        System.out.println(avgTempCat(t1, t2, t3, t4, t5));
        System.out.println(verifyEquals(expectRes,avgTempCat(t1, t2, t3, t4, t5)));

        printTCNumber();
        System.out.println(calculationSalary(170, 11));

        System.out.println(costOFProduct(25.5, 5));


    }

    public static String verifyEquals(int expectedResult, int actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if(expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }



    public static String dayOfWeekV1(int day){

        /* Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели. Протестировать метод */

        if (day == 1){
            return "Monday";
        } else if (day == 2){
            return "Tuesday";
        } else if (day == 3){
            return "Wednesday";
        } else if (day == 4){
            return "Thursday";
        } else if (day == 5){
            return "Friday";
        } else if (day == 6) {
            return "Saturday";
        } else if (day == 7){
            return "Sunday";
        }
        return "Day does not exist";
    }

    public static String dayOfWeekV2(int numberOfDay){
        String nameDays = null;
        switch (numberOfDay){
            case 1: nameDays = "Monday";
            break;
            case 2: nameDays = "Tuesday";
            break;
            case 3: nameDays = "Wednesday";
            break;
            case 4: nameDays = "Thursday";
            break;
            case 5: nameDays = "Friday";
            break;
            case 6: nameDays = "Saturday";
            break;
            case 7: nameDays = "Sunday";
            break;
            default: nameDays = "Day does not exist";
            break;
        }
        return nameDays;
    }

    public static int avgOldFamily(int age1, int age2, int age3){
        if (age1 <= 0 | age2 <= 0 | age3 <= 0){
            return 0;
        }
        double[] temp = {age1, age2, age3};
        double result = 0;
        for (double t : temp){
            result = result + t;
        }
        return (int)result/temp.length;

    }

    public static int minValue(int a, int b){
        return Math.min(a, b);
    }

    public static int minValue(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }

    public static int minValue(int a, int b, int c, int d){
        return Math.min(Math.min(Math.min(a, b), c), d);
    }

    public static double avgTempCat(double t1, double t2, double t3, double t4, double t5) {
        if (t1 < 25 | t1 > 45 | t2 < 25 | t2 > 45 | t3 < 25 | t3 > 45 | t4 < 25 | t4 > 45 | t5 < 25 | t5 > 45) {
            return -1;
        } else {
            double[] temp = {t1, t2, t3, t4, t5};
            double result = 0;
            for (double d : temp) {
                result = result + d;
            }

            if (result / temp.length < 25 | result / temp.length > 41) {
                return -1;
            }
            return result / temp.length;
        }
    }

    public static int calculationSalary(int countOfHours, double costOfHour){
        if (costOfHour < 12){
            System.out.println("law violation");
        }
        if(countOfHours < 0){
            System.out.println("Error");
        }
        return (int) (countOfHours * costOfHour);
    }

    public static double costOFProduct(double price, int amount){
        if(price < 0 || amount < 0){
            return -1;
        }
        return (double) (price * amount);
    }

    static int tcNumber = 1;
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++  + "\t -- \t");
    }


}
