package QAForEveryone.Lesson4;

public class piramidsStringBuilder {
    public static void main(String[] args) {
        //Method 1
        String num = "0123456789";
        StringBuilder numCut = new StringBuilder(num);
        System.out.println(numCut);
        for (int i = 1; i <= num.length(); i++) {
            System.out.println(numCut.deleteCharAt((num.length() - i)));
        }



        //Method 2
        num = "0123456789";
        String z = " ";
        numCut = new StringBuilder(num);
        for (int i = 1; i <= numCut.length(); i += 2) {
            numCut = numCut.insert(i, z);
        }
        System.out.println(numCut);
        int d = numCut.length();
        for (int i = 2; i <= d; i += 2) {
            System.out.println(numCut.deleteCharAt((d - i)));
        }
    }
}
