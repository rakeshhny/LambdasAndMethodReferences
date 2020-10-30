import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sort list of String in order of string's length
 */
public class Example1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("thane","mulund","bhandup","cst","parel","sion");
        System.out.println("Before sorting\n" + strings);

        Collections.sort(strings);
        System.out.println("After sorting\n" + strings);

        //-------------------------------------------------------

        // Anonymous class instance as a "function object"
        // Comparator represents an abstract strategy for sorting and function object provides
        // concrete strategy for sorting. (Strategy Design Pattern)

//        Collections.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });
//
//        System.out.println("After sorting using function object\n" + strings);

        //--------------------------------------------------------

        // Using Lambda expression as a function object (Replaces anonymous class)

//        Collections.sort(strings, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
//        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // Unbounded instance method reference String::length
        // The return type of
        // String.length()
        // matches the return of
        // ToIntFunction.applyAsInt(...)
//        Collections.sort(strings, Comparator.comparingInt(String::length));
//        strings.sort(Comparator.comparingInt(String::length));
//
//        System.out.println("After sorting using lambda expression\n" + strings);
    }
}
