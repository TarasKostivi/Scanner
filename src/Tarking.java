import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarking {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        String word = "";

        while (!word.contains("brake")){
            word = scanner.next();
            list.add(word);

        }
        for (String str: list){
            System.out.println(str);
        }
        while (list.size() > 5){
            list.remove(list.size()-1);
        }
        if(list.size() <= 0){
            throw new Exception("404");
        }
    }

}
