package br.com.edsonfilho.oncast.comparators;

import br.com.edsonfilho.oncast.bean.Book;

/**
 * ByAuthorBookComparator class used to order Books by their author name.
 * @author Edson Filho
 * @version 1.0
 */
public class ByAuthorBookComparator extends BookComparator {

	@Override
	public int toCompare(Book b1, Book b2) {
		return b1.getAuthor().compareTo(b2.getAuthor());
	}

}
