import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Unbounded instance method reference example
 */
public class UnboundInstanceMethodReferenceExample {
    public static void main(String[] args) {
        // 1) Convert a list of String from lowercase strings to uppercase strings
        List<String> stringsLowerCase = Arrays.asList("java","python","html","perl","react","haskell");
        System.out.println("String Lower Case = " + stringsLowerCase);

        List<String> stringsUpperCase =  stringsLowerCase.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        // The above statement can be rewritten using an unbounded instance method reference like below
        stringsUpperCase =  stringsLowerCase.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("String Upper Case = " + stringsUpperCase);


    }
}
