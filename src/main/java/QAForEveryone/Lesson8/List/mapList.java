package QAForEveryone.Lesson8.List;

import java.util.HashMap;
import java.util.Map;

public class mapList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // таблица типа ключ : значение
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);
        System.out.println(map.get(3));

        System.out.println(map.containsKey(10));
        System.out.println(map.size());
        System.out.println(map.containsValue("two"));
    }
}
