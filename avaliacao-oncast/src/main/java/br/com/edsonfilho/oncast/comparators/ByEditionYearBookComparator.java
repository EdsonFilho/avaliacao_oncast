package br.com.edsonfilho.oncast.comparators;

import br.com.edsonfilho.oncast.bean.Book;

/**
 * ByEditionYearBookComparator class used to order Books by their year of edition.
 * @author Edson Filho
 * @version 1.0
 */
public class ByEditionYearBookComparator extends BookComparator {

	@Override
	public int toCompare(Book b1, Book b2) {
		return b1.getEditionYear().compareTo(b2.getEditionYear());
	}

}
