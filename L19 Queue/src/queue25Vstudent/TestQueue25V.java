package queue25Vstudent;

import java.util.NoSuchElementException;

public class TestQueue25V {
    public static void main(String[] args) {
        Queue25V<String> queue = new DoubleLinkedQueue25V<>();
//        Queue25V<String> queue = new ArrayQueue25V<>();
//        Queue25V<String> queue = new SingleLinkedQueue25V<>();

        System.out.println("Empty queue = " + queue);
        System.out.println();

        queue.add("A");
        System.out.println("One element queue = " + queue);
        System.out.println();

        queue.add("B");
        System.out.println("two element queue = " + queue);
        System.out.println();

        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println("Five element queue = " + queue);
        System.out.println("queue.element() = " + queue.element());
        System.out.println();

        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.element() = " + queue.element());
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println("queue.element() = " + queue.element());
        System.out.println();

        System.out.println("Removed = " + queue.remove());
        System.out.println("queue = " + queue);
        System.out.println();

        System.out.println("queue.isEmpty() = " + queue.isEmpty());
        System.out.println("queue.size() = " + queue.size());
        System.out.println();

        try {
            System.out.println("Remove from empty queue:");
            queue.remove();
        } catch (NoSuchElementException ex) {
            System.out.println("\tNoSuchElementException is thrown");
        }
        try {
            System.out.println("Element at head in empty queue:");
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
