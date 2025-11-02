package queue25Vstudent;

public class ArrayQueue25V<E> implements Queue25V<E> {
    // 0 is the index of the element at the front of the queue

    // size is the index of the first unused entry at the back of the queue,
    // (size is also the number of elements in the queue)
    private int size = 0;

    // items contains the elements in the queue at index 0..size-1
    @SuppressWarnings("unchecked")
    private E[] items = (E[]) new Object[4];

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
}
