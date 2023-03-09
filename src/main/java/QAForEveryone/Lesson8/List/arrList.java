package QAForEveryone.Lesson8.List;

import java.util.ArrayList;
import java.util.List;

public class arrList {
    public static void main(String[] args) {

        String[] arr = new String[]{"one", "two", "three"};

        List<String> arrayList = new ArrayList<>();
        arrayList.add("a"); // добавляем элементы
        arrayList.add("two");
        arrayList.add("c");
        System.out.println(arrayList);

        arrayList.add(1, "b");
        System.out.println(arrayList);

        arrayList.remove(2); // удаляем элемент
        System.out.println(arrayList);

        arrayList.set(1, "B"); // изменяем
        System.out.println(arrayList);

        System.out.println(arrayList.contains("B")); // проверка что элемент есть в списке
        System.out.println(arrayList.indexOf("B")); // поиск индекса по элементу

        List<Integer> arr2 = new ArrayList<>(3);

        arr2.add(2);
        arr2.add(3);
        int a = arr2.get(1);
        System.out.println(a);
    }
}
