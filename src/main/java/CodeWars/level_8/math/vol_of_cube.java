package CodeWars.level_8.math;

public class vol_of_cube {
    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));//63
    }
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
