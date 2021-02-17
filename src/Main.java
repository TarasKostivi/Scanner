import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Shopping shopping = new Shopping("Cofe Arabica", 20);
        Shopping shopping1 = new Shopping("Tea Liphton", 30);
        Shopping shopping2 = new Shopping("Chocolade", 40);

        TreeSet<Shopping> shoppings = new TreeSet<>();
        shoppings.add(shopping);
        shoppings.add(shopping1);
        shoppings.add(shopping2);

        for (Shopping strSort : shoppings){
            System.out.println(strSort);
        }

        LinkedHashSet<Shopping> shoppings1 = new LinkedHashSet<>();
        shoppings1.add(shopping);
        shoppings1.add(shopping1);
        shoppings1.add(shopping2);

        for (Shopping intSort : shoppings1){
            System.out.println(intSort);
        }

        HashSet<Shopping> shoppings2 = new HashSet<>();
        shoppings2.add(shopping);
        shoppings2.add(shopping1);
        shoppings2.add(shopping2);

        for (Shopping hasCode : shoppings2){
            System.out.println(hasCode);
        }
    }
}
