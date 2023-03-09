package CodeWars.level_8.math;

public class Count_Odd_Numbers_below_n {
    public static void main(String[] args) {
        System.out.println(oddCount(15)); //7
        System.out.println(oddCount(15023)); //7511
    }
    public static int oddCount(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
