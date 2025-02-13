package Uppgift_3_kator_lambda;

import java.util.List;

public class UpperCase {

    public static List<String> transform(List<String> l){
    List <String> l2 = l.stream()
            .map(a -> a.toUpperCase())
            .toList(); //using toList
    return l2;
    }
}