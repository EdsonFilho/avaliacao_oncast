package br.com.edsonfilho.oncast.comparators;

import br.com.edsonfilho.oncast.bean.Book;

/**
 * ByTitleBookComparator class used to order Books by their titles.
 * @author Edson Filho
 * @version 1.0
 */
public class ByTitleBookComparator extends BookComparator {

	@Override
	public int toCompare(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}

}
