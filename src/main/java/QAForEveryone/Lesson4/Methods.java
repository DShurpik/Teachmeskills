package QAForEveryone.Lesson4;

public class Methods {

    static int[] arr = {4, 3, 5, 6, 8, 11, 111};

    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "World";

        printString(string1, string2);

        System.out.println(prePrintArray(arr));



    }
    static String prePrintArray(int[] array){
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < array.length; i++){
            stringBuffer.append(array[i]);
            if(i != array.length - 1){
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
        String result = stringBuffer.toString();
        return result;
    }

    private static void printString(String str1, String str2){ //  методы void возвращают ничего(пустоту). Void без return
        System.out.println(str1 + " " + str2 + "!");

    }





}
