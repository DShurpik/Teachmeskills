package QAForEveryone.Lesson3;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[] g = new int[10];
        for (int i =0; i < g.length; i++){
            System.out.print(g[i] + " ");
        }
        int[][] multyarray =
                {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        System.out.println("\n" + Arrays.deepToString(multyarray));
        for (int i = 0; i < multyarray.length; i++){
            int[] array = (int[]) multyarray [i];
            for (int x : array){
                System.out.print(x + " ");
            }
        }
        int[] mass = {1,2,3,4,5,6};
        for(int i = 0; i < mass.length; i++){
            System.out.print("\n" + mass[i] + " ");
        }
        for (int x : mass){
            System.out.println(x);
        }
    }
}
