package CodeWars.level_8.Algoritmes;

public class Terminal_game_move_function {
    public static void main(String[] args) {
        System.out.println(move(0, 4)); //8
        System.out.println(move(3,6));  //15
    }

    public static int move(int position, int roll) {
        return position + roll * 2;
    }
}
