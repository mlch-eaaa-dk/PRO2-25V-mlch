package innerclasses;

public class Outer {
    private String out = "out";
    private static String staticOut = "staticOut";

    private final Inner inner = new Inner();

    public void testInnerIsVisibleInOuter() {
        System.out.println("From method in Outer - print fields from Inner class:");
        System.out.println(inner.in);         // access to private field in Inner class
        System.out.println(inner.staticIn);   // access to private static field in Inner class
        System.out.println();

        inner.testOuterIsVisibleInInner();
    }

    private /*static*/ class Inner {
        private String in = "in";
        private String staticIn = "staticIn";

        public void testOuterIsVisibleInInner() {
            System.out.println("From method in Inner - print fields from Outer class:");
            System.out.println(out);        // access to private field in Outer class
            System.out.println(staticOut);  // access to private static field in Outer class
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.testInnerIsVisibleInOuter();
    }
}
