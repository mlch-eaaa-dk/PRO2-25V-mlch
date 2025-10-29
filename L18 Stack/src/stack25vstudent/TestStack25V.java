package stack25vstudent;

public class TestStack25V {

    public static void main(String[] args) {
        Stack25V<String> stack = new SingleLinkedStack25V<>();
//        Stack25V<String> stack = new ListStack25V<>();
//        Stack25V<String> stack = new ArrayStack25<>();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");
        stack.push("Thomas");
        stack.push("Bob");
        stack.push("Brian");
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println();

        System.out.println(stack.isEmpty() + " " + stack.size());
        System.out.println();

        // -------- test of reverse --------
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    /** Reverse the order of the elements in the table. */
    public static <E> void reverse(E[] table) {
        Stack25V<E> stack = new SingleLinkedStack25V<>();
        // Stack25V<E> stack = new ListStack25V<>();
        // Stack25V<E> stack = new ArrayStack25V<E>();
        for (E e : table) {
            stack.push(e);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            table[i] = stack.pop();
            i++;
        }
    }
}
