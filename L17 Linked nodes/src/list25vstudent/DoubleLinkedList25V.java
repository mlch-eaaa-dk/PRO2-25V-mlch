package list25vstudent;

import java.util.Iterator;

/**
 * A double-linked nodes based implementation of the List ADT.
 * The list cannot contain null elements.
 */
public class DoubleLinkedList25V<E> implements List25V<E> {
    private Node<E> header = new Node<>(null);
    private Node<E> trailer = new Node<>(null);
    private int size = 0;

    public DoubleLinkedList25V() {
        header.next = trailer;
        trailer.prev = header;
    }

    /**
     * Add the element to the end of this list.
     */
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        // insert newNode between trailer.prev and trailer
        newNode.prev = trailer.prev;
        newNode.next = trailer;
        trailer.prev.next = newNode;
        trailer.prev = newNode;
        size++;
    }

    /**
     * Remove the first occurrence of the element from this list.
     * Return true if this list is modified.
     */
    @Override
    public boolean remove(E e) {
        // TODO
        return false;
    }

    /**
     * Return true if this list contains the element.
     */
    @Override
    public boolean contains(E e) {
        // TODO
        return false;
    }

    /**
     * Remove all elements from this list.
     */
    @Override
    public void clear() {
        header.next = trailer;
        trailer.prev = header;
        size = 0;
    }

    /**
     * Return the size of this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true if this list is empty.
     */
    @Override
    public boolean isEmpty() {
        return header.next == trailer;
    }

    /**
     * Return the element at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index >= size().
     */
    @Override
    public E get(int index) {
        // TODO
        return null;
    }

    /**
     * Add the element to this list at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index > size().
     * Note: The element can be added at an index equal to size().
     */
    @Override
    public void add(int index, E e) {
        // TODO
    }

    /**
     * Remove and return the element at the index.
     * Throw IndexOutOfBoundsException if index < 0 or index >= size().
     */
    @Override
    public E removeAt(int index) {
        // TODO
        return null;
    }

    /**
     * Return the index of the element in this list.
     * Return -1 if this list does not contain the element.
     */
    @Override
    public int indexOf(E e) {
        // TODO
        return -1;
    }

    //-------------------------------------------

    @Override
    public String toString() {
        // TODO return list as a string (use a StrungBuilder in the implementation)
        String s = "";
        Node<E> node = header.next;
        while (node != trailer) {
            s += node.element + ", ";
            node = node.next;
        }
        return s;
    }

    //-------------------------------------------

    /**
     * Return an iterator over this list.
     */
    @Override
    public Iterator<E> iterator() {
        // TODO
        return null;
    }

    //-------------------------------------------

    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T t) {
            this.element = t;
            this.next = null;
            this.prev = null;
        }
    }
}
