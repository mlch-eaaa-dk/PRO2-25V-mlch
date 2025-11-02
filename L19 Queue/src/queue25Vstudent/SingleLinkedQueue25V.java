package queue25Vstudent;

public class SingleLinkedQueue25V<E> implements Queue25V<E> {
    // head points to the node at the front of the queue
    // (= the first node in the single-linked list)
    private Node<E> head = null;

    // tail points to the node at the back of the queue
    // (= the last node in the single-linked list)
    private Node<E> tail = null;

    // the number of elements
    int size = 0;

    /**
     * Add the element at the back of the queue.
     */
    @Override
    public void add(E element) {
        // TODO
    }

    /**
     * Remove and return the element at the front of the queue.
     * Throw a NoSuchElementException() if the queue is empty.
     */
    @Override
    public E remove() {
        // TODO
        return null;
    }

    /**
     * Return the element at the front of the queue.
     * Throw a NoSuchElementException() if the queue is empty.
     */
    @Override
    public E element() {
        // TODO
        return null;
    }

    /**
     * Return true if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        // TODO
        return null;
    }

    //-------------------------------------------------------------------------

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}
