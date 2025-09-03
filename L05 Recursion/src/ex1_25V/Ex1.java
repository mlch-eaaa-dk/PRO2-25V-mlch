package ex1_25V;

public class Ex1 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            System.out.printf("n: %2d   factorial = %,d \n", n, factorial(n));
        }
    }

    // 1! = 1           factorial(1) = 1
    // n! = n*(n-1)!    factorial(n) = n * factorial(n-1)

    // Definition: factorial(n) = n!

    /**
     * Return n!
     * Pre: n >= 1.
     */
    public static int factorial(int n) {
        int result; // result = factorial(n)
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n-1);
        }
        return result;
    }

    /**
     * Return n!
     * Pre: n >= 1.
     */
    public static int fac(int n) {
        if (n == 1) {
            return  1;
        } else {
            return n * fac(n-1);
        }
    }
}
