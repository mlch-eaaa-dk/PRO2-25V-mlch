package ex4iteratorstudent;

/** null is not allowed as a value in the collection. */
public class ArrayedList<T> {
    // array to store the entries in
    // (not-empty entries have indices in [0, size-1])
    private T[] items;
    // number of entries in the list
    // (also index of the first empty slot in items)
    private int size;


    /** Create an ArrayedList with capacity 4. */
    public ArrayedList() {
        this(4);
    }

    /**
     * Create an ArrayedList with the given capacity.
     * Pre: capacity >= 1.
     */
    public ArrayedList(int capacity) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[capacity];
        items = temp;
        size = 0;
    }

    private void increaseCapacity() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[2 * items.length];
        if (size >= 0) {
            System.arraycopy(items, 0, temp, 0, size);
        }
        items = temp;
    }

    /** Add the entry at the end of this list. */
    public void add(T entry) {
        if (size == items.length) this.increaseCapacity();

        items[size] = entry;
        size++;
    }

    /**
     * Add the entry at the index.
     * Throw IndexOutOfBoundsException if the index is not in [0, size()].
     */
    public void add(int index, T entry) {
        // TODO
    }

    /**
     * Remove and return the entry at the index.
     * Throw IndexOutOfBoundsException if this list is empty
     * or the index is not in [0, size()-1].
     */
    public T remove(int index) {
        // TODO
        return null;
    }

    /**
     * Replace and return the old entry at the index
     *   with the specified entry.
     * Throw IndexOutOfBoundsException if this list is empty
     * or the index is not in [0, size()-1].
     */
    public T replace(int index, T entry) {
        // TODO
        return null;
    }

    /**
     * Return the entry at the index.
     * Throw IndexOutOfBoundsException if this list is empty
     * or the index is not in [0, size()-1].
     */
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return items[index];
    }

    /** Return true if the entry is in this list. */
    public boolean contains(T entry) {
        // TODO
        return false;
    }

    /** Return the number of entries in this list. */
    public int size() {
        return size;
    }

    /** Return true if this list is empty. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Remove all entries from this list. */
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return ("[]");

        StringBuilder sb = new StringBuilder("[").append(items[0]);
        for (int i = 1; i < size; i++) {
            sb.append(", ").append(items[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
