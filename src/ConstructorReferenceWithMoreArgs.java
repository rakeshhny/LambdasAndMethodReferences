import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Use Constructor Reference to create an instance of a class
 * who has parametrized constructor.
 */
public class ConstructorReferenceWithMoreArgs {
    public static void main(String[] args) {
        Function<String, Student> studentFactory1 = Student::new;
        Function<String, Student> studentFactory1Equivalent = fname -> new Student(fname);

        BiFunction<String, String, Student> studentFactory2 = Student::new;
        BiFunction<String, String, Student> studentFactory2Equivalent = (fname, lname) -> new Student(fname, lname);
    }
}

class Student {
    public final  String fname;
    public final String lname;

    public Student(String name) {
        System.out.println("Using one arg constructor.");
        this.fname = name;
        this.lname = "last name";
    }

    public Student(String fname, String lname) {
        System.out.println("Using two args constructor.");
        this.fname = fname;
        this.lname = lname;
    }

}
