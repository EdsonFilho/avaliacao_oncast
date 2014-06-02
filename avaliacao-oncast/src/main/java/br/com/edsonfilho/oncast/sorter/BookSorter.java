package br.com.edsonfilho.oncast.sorter;

import java.util.Comparator;
import java.util.List;

import br.com.edsonfilho.oncast.bean.Book;
import br.com.edsonfilho.oncast.exception.OrderingException;

/**
 * BookSorter interface.
 * @author Edson Filho
 * @version 1.0
 */
public interface BookSorter {
	
	/**
	 * Sort method, used to sort Books.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public List<Book> sort(List<Book> ls, Comparator<Book> c) throws OrderingException;
	
}
