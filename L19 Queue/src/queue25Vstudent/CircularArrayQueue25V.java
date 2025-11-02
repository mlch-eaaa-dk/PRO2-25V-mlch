package queue25Vstudent;

public class CircularArrayQueue25V<E> implements Queue25V<E> {
    // items contains the elements in the queue
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];

    // head is the index of the element at the front of the queue
    // (elements are removed at head)
    private int head = 0;
    // tail is the index of the first free position after the back of the queue
    // (elements are added at tail)
    private int tail = 0;

    // size is the number of elements in the queue
    private int size = 0;

    // OBS: Only to be used in tests!! (items is an implementation detail)
    public E[] getItems() {
        return items;
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
        return size == 0;
    }

    /**
     * Remove all elements from the queue.
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return a string representation of the queue
     * with the format [e1, e2, ..., en]
     * where e1 is the front and en is the back of the queue.
     */
    @Override
    public String toString() {
        // TODO
        return null;
    }
}
