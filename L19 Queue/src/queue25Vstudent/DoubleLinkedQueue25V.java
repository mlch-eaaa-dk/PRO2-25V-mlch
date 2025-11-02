package queue25Vstudent;

public class DoubleLinkedQueue25V<E> implements Queue25V<E> {
    // header.next points to the node at the front of the queue
    private Node<E> header = new Node<>(null);

    // trailer.prev points to the node at the back of the queue
    private Node<E> trailer = new Node<>(null);

    // size is the number of elements in the queue
    private int size = 0;

    public DoubleLinkedQueue25V() {
        header.next = trailer;
        trailer.prev = header;
    }

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
        return header.next == trailer;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
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

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.element = element;
        }
    }
}
