package QAForEveryone.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> data1 = new ArrayList<>();
        data1.add("Audi RS");
        data1.add("WV Polo");
        data1.add("Lada Granta");
        data1.add("Audi Q3");

        List<String> data2 = new ArrayList<>() {{
            add("Audi");
            add("WV");
            add("Lada");
        }};

        String[] array = {"123", "123", "123"};

        List<String> data3 = Arrays.asList("Audi", "WV", "Lada");

        List<String> dataWithV = data3.stream().map(car -> car + " 2.0").collect(Collectors.toList());
        System.out.println(dataWithV);


        List<String> audiData = data1.stream().map(car -> {
            if (car.contains("Audi")) {
                return car + " Quattro";
            }
            return car;
        }).collect(Collectors.toList());

        System.out.println(audiData);
    }
    }
