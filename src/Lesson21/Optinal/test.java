package Lesson21.Optinal;

import java.util.Optional;

public class test {
    public static void main(String[] args) {
        Optional<String> date = Optional.of("null");
        Optional<String> dateF = Optional.ofNullable(null);
        Optional<String> dataEmpty = Optional.empty();
        String s = dateF.get();

        boolean b = date.isPresent();
        dateF.ifPresent(ff -> System.out.println());
        dateF.orElse("23");
        dateF.orElseGet(()-> "dfdfsfs");
        try {
            dateF.orElseThrow(() -> new Exception());
        } catch (Exception e) {
            e.printStackTrace();
        }

        dateF.map(tex -> tex.toUpperCase()).filter(tilp -> tilp.startsWith("A"));
    }



}
