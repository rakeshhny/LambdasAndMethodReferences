import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Count occurrences of each word in list
 */

public class Example2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("word2","word3","word2","word3","word1","word3");

        Map<String, Integer> resultMap = new HashMap<>();
        words.forEach(word -> resultMap.merge(word,1, (count, incr) -> count + incr));

        // FYI - merge(...) method was added to the Map interface in Java 8

        System.out.println("Result1 = \n" + resultMap);

        // The code above looks clean but still there is some boilerplate.
        // The words count and incr does not add much value and take a lot of horizontal space.
        // All we know is that the lambda returns the sum of 2 arguments supplied.
        // As of Java 8 all the boxed numerical primitive classes are having static sum method which does exactly the  same
        // thing. We will leverage this method below.

        // With less visual clutter
        Map<String, Integer> resultMap2 = new HashMap<>();
        words.forEach(word -> resultMap2.merge(word, 1, Integer::sum));
        System.out.println("Result2 = \n" + resultMap2);

        // Integer::sum -> Takes 2 arguments are returns an Integer
        // which is same as
        // lambda expression which takes 2 arguments are returns an Integer.
    }
}
