public class Example3LongClassName {
    public static void main(String[] args) {
        // calling the method of the same class using
        // a method reference
        Thread ref1 = new Thread(Example3LongClassName::action);

        // calling the method of the same class using
        // a lambda expression
        Thread ref2 = new Thread(() -> action());

        ref1.start();
        ref2.start();

        // The latter approach using lambda is more succinct than method reference.
    }

    static void action() {
        System.out.println("This is an action");
    }
}
