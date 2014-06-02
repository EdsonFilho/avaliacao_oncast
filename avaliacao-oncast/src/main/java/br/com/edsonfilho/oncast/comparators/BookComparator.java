package br.com.edsonfilho.oncast.comparators;

import java.util.Collections;
import java.util.Comparator;

import br.com.edsonfilho.oncast.bean.Book;

/**
 * BookComparator abstract class.
 * @author Edson Filho
 * @version 1.0
 */
public abstract class BookComparator implements Comparator<Book> {

	private Comparator<Book> next;
	
	public abstract int toCompare(Book b1, Book b2);
	
	/**
	 * Compare two Books, and return a number to be used by the Collections class, or call the next comparator if needed.
	 * @author Edson Filho
	 * @since 1.0
	 * @see java.util.Collections
	 */
	public int compare(Book o1, Book o2){
		int rtn = toCompare(o1, o2);
		if(rtn == 0 && next != null){
			return next.compare(o1, o2);
		}
		return rtn;
	}
	
	/**
	 * Defines the direction of sort as ascending, and receive a new comparator to be used in case of equal result.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public Comparator<Book> asc(Comparator<Book> next){
		this.next = next;
		return this;
	}
	
	/**
	 * Defines the direction of sort as descending, and receive a new comparator to be used in case of equal result.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public Comparator<Book> desc(Comparator<Book> next){
		this.next = next;
		return Collections.reverseOrder(this);
	}
}
