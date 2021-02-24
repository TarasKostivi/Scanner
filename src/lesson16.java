import java.util.*;

public class lesson16 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Text", "fasf", "sfs"));
        Set<String> stringSet = new HashSet<>(strings);
        Map<String, List<String>> stringStringMap = new HashMap<>();
        stringStringMap.put("1", strings);
        stringStringMap.put("2", strings);
        stringStringMap.put("3", strings);
        stringStringMap.put("4", strings);
        stringStringMap.put("5", strings);
        stringStringMap.put("6", strings);

        strings.forEach(s -> {
            System.out.println(s);
            stringSet.add(Integer.valueOf(s.hashCode()).toString());
        });

        int number = 5;

        stringSet.forEach(x ->{
            System.out.println(x);
            System.out.println(number);
            int res = number + x.hashCode();
            System.out.println(res);
        });

        stringStringMap.forEach((key, value) -> {
            System.out.println("Key: " + key);
            value.forEach(System.out::println);
        });


    }
}
