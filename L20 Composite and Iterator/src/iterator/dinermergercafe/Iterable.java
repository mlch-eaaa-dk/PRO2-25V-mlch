package iterator.dinermergercafe;

import java.util.Iterator;

public interface Iterable<T> { // named Menu in the book
	Iterator<T> createIterator();
}
