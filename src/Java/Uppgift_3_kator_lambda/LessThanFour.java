package Java.Uppgift_3_kator_lambda;

import java.util.ArrayList;
import java.util.List;

public class LessThanFour {

    public static List<String> transform(List<String> l){
        List<String> results = new ArrayList<>();
        l.stream()
                .filter(a -> a.length() < 4)
                .forEach(results::add); //using add and method reference operator
    return results;
    }
}