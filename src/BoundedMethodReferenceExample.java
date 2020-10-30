import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Bounded instance method reference example.
 * Static method reference example.
 * Bounded instance method references are similar to static method references.
 */

public class BoundedMethodReferenceExample {
    public static void main(String[] args) {
        // Program - Parse list of integers in string into a list of integer
        List<String> intStringList = Arrays.asList("1","2","3","4","5","6");

        // static method reference example
        // No. of arguments to the method reference (Integer.parseInt(arg)) are same as
        // the num of arguments to function object (Function.apply(arg))
        List<Integer> intList = intStringList.stream().map(Integer::parseInt).collect(Collectors.toList());

        // bounded instance method reference example
        // Num of arguments to the method referenced(println(arg)) are same as
        // the num of arguments to the function object (Consumer.accept(arg))
        intStringList.forEach(System.out::println);

        // static method reference example
        // Num of arguments to the method referenced(sum(arg1,arg2)) are same as
        // the num of arguments to the function object (BiFunction.apply(arg1, arg2))
        Integer sum = intList.stream().reduce(Integer::sum).get();
    }
}
