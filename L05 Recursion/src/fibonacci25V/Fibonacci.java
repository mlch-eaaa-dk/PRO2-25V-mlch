package fibonacci25V;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%3d   %,d\n", i, fib(i));
        }
        System.out.println();
    }

    //  index | 0 | 1 | 2 | 3 | 4 | 5 |  6 |  7 |  8 |
    //  ------+---+---+---+---+---+---+----+----+----+
    //  value | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 |

    // the next value is the sum of the 2 previous values

    // value at index i = (value at index i-2) + (value at index i-1)

    // Definition: fib(i) = value at index i

    // fib(i) = fib(i-2) + fib(i-1)  // recursive case
    // fib(0) = 1                    // base case
    // fib(1) = 1                    // base case

    public static long fib(int i) {
        long result; // result = fib(i)
        if (i == 0 || i == 1) {
            result = 1;
        } else {
            result = fib(i - 2) + fib(i - 1);
        }
        return result;
    }
}
