package ex2student;

public class Ex2App {

    public static void main(String[] args) {
        String s1 = "(3+{5[99{*}]}[23[{67}67]])";
        String s2 = "(3+{5[99{*}]}[23[{67}67]]";
        String s3 = "({)}";
        String s4 = "}{";
        System.out.println("isBalanced on " + s1 + "? " + isBalanced(s1));
        System.out.println("isBalanced on " + s2 + "? " + isBalanced(s2));
        System.out.println("isBalanced on " + s3 + "? " + isBalanced(s3));
        System.out.println("isBalanced on " + s4 + "? " + isBalanced(s4));
    }

    /**
     * Check if the given string has balanced parentheses, curly braces and square brackets.
     * Note: This method is implemented using a stack.
     */
    public static boolean isBalanced(String s) {
        // TODO
        return false;
    }
}
