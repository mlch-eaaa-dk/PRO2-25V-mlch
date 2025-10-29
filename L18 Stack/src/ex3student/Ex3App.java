package ex3student; // OPGAVE 3

public class Ex3App {

    public static void main(String[] args) {
        String input1 = "ABCDEFGFEDCBA";
        String input2 = "ABCCA";
        String input3 = "A";

        System.out.println("Is " + input1 + " a palindrome? " + isPalindrome(input1));
        System.out.println("Is " + input2 + " a palindrome? " + isPalindrome(input2));
        System.out.println("Is " + input3 + " a palindrome? " + isPalindrome(input3));
    }

    /**
     * Check if the given string is a palindrome, converting characters to lowercase
     * and ignoring non-alphanumeric characters (characters not in a-z and 0..9).
     * Note: This method is implemented using a stack.
     */
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        // Remove non-alphanumeric characters and convert to lowercase.
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // TODO
        return false;
    }
}
