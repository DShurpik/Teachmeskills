package QAForEveryone.Lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> data2 = new ArrayList<>() {{
            add("Audi");
            add("WV");
            add("Lada");
            add("Ford");
            add("Bentley");
        }};

        Iterator itr = data2.iterator();

        while (itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }
    }
}
