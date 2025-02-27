package Java.Uppgift_3_kator_lambda.test.Uppgift_3_kator_lambda;

import Java.Uppgift_3_kator_lambda.LessThanFour;
import org.junit.Test;
import java.util.List;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class LessThanFourTest {

/*
Filter collection so that only elements with less than 4 characters are returned.
 */
        @Test
        public void transformShouldFilterCollection() {

            List<String> collection = asList("My", "name", "is", "John", "Doe");
            List<String> expected = asList("My", "is", "Doe");
            List<String> result = LessThanFour.transform(collection);

            assertEquals(result.size(), 3);
            assertEquals(result.get(0), expected.get(0));
            assertEquals(result.get(1), expected.get(1));
            assertEquals(result.get(2), expected.get(2));
        }
    }