import java.util.*;

public class List2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(2);
        number.add(25);
        number.add(28);
        number.add(29);

        ListIterator<Integer> listIterator = number.listIterator();

        while (listIterator.hasNext() ){
            System.out.println(listIterator.next()+1);
        }

        listIterator = number.listIterator();
        while (listIterator.hasNext()){
            int temp = listIterator.next();
            System.out.println(temp + " ");

            listIterator.set(listIterator.next()*5);
        }
        listIterator = number.listIterator();
        while (listIterator.hasPrevious()){
            System.out.println(listIterator);
        }
//        listIterator = number.listIterator();
//        while (listIterator.next(): number){
//
//        }
    }
}
