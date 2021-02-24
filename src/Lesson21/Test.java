package Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Thonet", "ti", "Collection", "Temprison", "Thonet"));
        list.stream().filter(element -> element.length() >=4).forEach(System.out::println);// element -> element.length() >=4 Фільтрування слів більше чим 4 букви
        list.stream().skip(list.size() -1).forEach(System.out::println);//skip(list.size() -1) дозволяє пропустити n перших елементів
        list.stream().distinct().forEach(System.out::println); // distinct()Повертає стрім без дублікатів (для методу equals)
        list.stream().map(element -> element.toUpperCase()).forEach(System.out::println); //Ліст в верхньому регістрі
    }
}
