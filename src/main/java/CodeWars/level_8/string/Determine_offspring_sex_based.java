package CodeWars.level_8.string;

public class Determine_offspring_sex_based {
    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XX"));
        System.out.println(chromosomeCheck("XY"));
        System.out.println(sss("Igor"));
        System.out.println(sss("igor"));

    }

    public static String sss (String ss) {
        return ss.contains("I") ? "YES" : "NO";
    }


    public static String chromosomeCheck(String sperm) {
        if (sperm.equals("XX")) {
            return "Congratulations! You're going to have a daughter.";
        } else return "Congratulations! You're going to have a son.";
    }

    public static String chromosomeCheck1(String sperm) {
        return "Congratulations! You're going to have a " + (sperm.contains("Y") ? "son." : "daughter.");
    }

    public static String chromosomeCheck2(String sperm) {
        return String.format("Congratulations! You're going to have a %s.", sperm == "XY" ? "son" : "daughter");
    }
}
