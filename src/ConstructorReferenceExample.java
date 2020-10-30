import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Supplier;

/**
 * Constructor reference example.
 * It covers 2 types of constructor reference
 * 1) Class Constructor
 * 2) Array Constructor
 */
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // Class Constructor reference

        // Be mindful that Class::new will resolve to a functional interface and do not
        // misunderstand this with Class ref = Class::new; This won't compile.

        Supplier<HashMap<String, String>> mapSupplier = HashMap::new;
        Supplier<HashSet<String>> setSupplier = HashSet::new;

        // Array Constructor reference
        ArrayConstruction<String> stringArrayConstruction = String[]::new;
        ArrayConstruction<Integer> integerArrayConstruction = Integer[]::new;
    }
}

@FunctionalInterface
interface ArrayConstruction<T> {
    T[] accept(int l);
}
