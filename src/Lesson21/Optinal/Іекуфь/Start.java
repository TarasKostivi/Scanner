package Lesson21.Optinal.Іекуфь;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "One"));

        long countOne = list.stream().filter(s -> s.equals("One")).count();
        System.out.println(countOne);

        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println(firstElement);

        String lastElement = list.stream()
                .skip(list.size()-1)
                .findFirst()
                .orElse("empty");
        System.out.println(lastElement);
    }
}
