package stack25vstudent;

// OPGAVE 1 med single-linked liste.
public class SingleLinkedStack25V<E> implements Stack25V<E> {
    // top of stack is at head of the list
    private Node<E> head = null;
    // the number of elements in the stack
    int size = 0;

    /**
     * Add the element at the top of this stack.
     */
    @Override
    public void push(E entry) {
        // TODO
    }

    /**
     * Remove and return this stack's top element.
     * Throw NoSuchElementException if the stack is empty.
     */
    @Override
    public E pop() {
        // TODO
        return null;
    }

    /**
     * Return this stack's top element.
     * Throw NoSuchElementException if the stack is empty.
     */
    @Override
    public E peek() {
        // TODO
        return null;
    }

    /**
     * Return true if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return false;
    }

    /**
     * Removes all elements from this stack.
     */
    @Override
    public void clear() {
        // TODO
    }

    /**
     * Return the number of elements in the stack.
     */
    @Override
    public int size() {
        // TODO
        return 0;
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
            this.next = null;
        }
    }
}
