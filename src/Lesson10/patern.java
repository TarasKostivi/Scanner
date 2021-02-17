package Lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^https;//\\w+.com$");
        Matcher matcher = pattern.matcher("http://sfsfs.com");
        System.out.println(matcher.matches());

        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }

    }
}
