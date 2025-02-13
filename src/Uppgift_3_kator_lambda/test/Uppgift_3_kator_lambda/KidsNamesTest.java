package Uppgift_3_kator_lambda;

import org.junit.jupiter.api.Test;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Get names of all kids (under age of 18)
 */

public class KidsNamesTest {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    Person anna = new Person("Anna", 5);
    List<Person> collection = asList(sara, eva, viktor, anna);
    List<String> result = KidsNames.getKidNames(collection);

    @Test
    public void testListSize() {
        assertEquals(result.size(), 2);
    }

    @Test
    public void testListContains() {
        assertTrue(result.contains("Sara")); //att listan innehåller
        assertTrue(result.contains("Anna")); //att listan innehåller
    }

    @Test
    public void testNotInList() {
        assertFalse(result.contains("Viktor")); //att listan inte innehåller
        assertFalse(result.contains("Eva")); //att listan inte innehåller
    }
}