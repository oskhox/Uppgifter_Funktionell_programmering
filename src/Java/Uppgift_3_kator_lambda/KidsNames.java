package Java.Uppgift_3_kator_lambda;

import java.util.ArrayList;
import java.util.List;

public class KidsNames {

    public static List<String> getKidNames(List<Person> people) {
        List<String> results = new ArrayList<>();
        people.stream()
                .filter(p -> p.getAge() < 18)
                .forEach(p -> results.add(p.getName())); //using add
    return results;
    }
}