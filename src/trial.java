import java.util.Arrays;
import java.util.TreeSet;

public class trial {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5, 15, 17, 25, 22, 30,27,2, 0));

        for (Integer i: set) {
            System.out.println( i + " ");
        }
        System.out.println();
        for (Integer i : set.tailSet(17)) {
            System.out.println( i + " ");
        }
        System.out.println();
        System.out.println(set.first());
        System.out.println(set.higher(1));
    }
}
