package TMS.lesson10;

import java.util.*;

public class CheckListService {
    public static void main(String[] args) {
      maxWithList();
      inputString();
    }

    private static void maxWithList(){
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int maxValue = numbers.get(0);
        for (Integer number: numbers){
            if (number > maxValue)
                maxValue = number;
        }
    }

    private static void inputString() {
        List<Integer> list = new LinkedList<>();

        System.out.println("Введите ");

        Scanner scan = new Scanner(System.in);
        List<String> arrString = new ArrayList<>();
        List<Integer> lenghtString = new ArrayList<>();
        for (int i = 0; true; i++) {
            arrString.add(scan.next());

            lenghtString.add(arrString.get(i).length());

            if (arrString.get(i).equals("stop")) {
                break;
            }
        }
    }

}
