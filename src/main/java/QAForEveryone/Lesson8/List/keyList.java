package QAForEveryone.Lesson8.List;

import java.util.HashSet;
import java.util.Set;

public class keyList {
    public static void main(String[] args) {
        Set<Character> keys = new HashSet<>(); // лист НЕПОВТОРЯЮЩИХСЯ уникальных элементов
        keys.add('A');
        keys.add('B');
        keys.add('A');

        System.out.println(keys);

    }
}
