package towers;

public class Towers {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("towers(" + n + "):");
        towers(n);
        System.out.println();
    }

    /** Pre: n >= 1; */
    public static void towers(int n) {
        towers(n, 1, 3);
    }

    private static void towers(int n, int from, int to) {
        if (n == 1) {
            System.out.println("Move: " + from + " -> " + to);
        } else {
            int other = 6 - from - to;
            towers(n - 1, from, other);
            System.out.println("Move: " + from + " -> " + to);
            towers(n - 1, other, to);
        }
    }
}
