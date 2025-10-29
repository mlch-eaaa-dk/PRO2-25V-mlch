package stack25vstudent;

// OPGAVE 1 med array.
public class ArrayStack25V<E> implements Stack25V<E> {
    // top is the index of the top element in the stack
    // (top is -1 if the stack is empty)
    private int top = -1;
    // items contains the elements in the stack at index 0..top and null else
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];

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
     * Remove all elements from this stack.
     */
    @Override
    public void clear() {
        // TODO
    }

    /**
     * Return the number of elements in this stack.
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
}
