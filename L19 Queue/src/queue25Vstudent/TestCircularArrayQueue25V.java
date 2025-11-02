package queue25Vstudent;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TestCircularArrayQueue25V {
    public static void main(String[] args) {
        CircularArrayQueue25V<String> queue = new CircularArrayQueue25V<>();

        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("A");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("B");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("C");
        queue.add("D");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("E");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("F");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        System.out.println();

        queue.add("G");
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems()= " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("queue.element() = " + queue.element());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.getItems() = " + Arrays.toString(queue.getItems()));
        System.out.println();

        try {
            System.out.println("Remove from empty queue: ");
            queue.remove();
        } catch (NoSuchElementException ex) {
            System.out.println("\tNoSuchElementException is thrown");
        }
        try {
            System.out.println("Element at front in empty queue:");
            queue.element();
        } catch (NoSuchElementException ex) {
            System.out.println("\tNoSuchElementException is thrown");
        }
        System.out.println();


        queue.add("A");
        queue.add("B");
        System.out.println("queue = " + queue);
        System.out.println();

        queue.clear();
        System.out.println("After queue.clear():");
        System.out.println("queue = " + queue);
        System.out.println("queue.size() = " + queue.size());
    }
}
