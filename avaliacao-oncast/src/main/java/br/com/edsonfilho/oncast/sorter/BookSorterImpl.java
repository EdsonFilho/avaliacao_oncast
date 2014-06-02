package br.com.edsonfilho.oncast.sorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.edsonfilho.oncast.bean.Book;
import br.com.edsonfilho.oncast.exception.OrderingException;

/**
 * Descrição classe
 * 
 * @author Edson Filho
 * @version 1.0
 */
public class BookSorterImpl implements BookSorter {
	

	@Override
	public List<Book> sort(List<Book> ls, Comparator<Book> c) throws OrderingException {
		if(c == null){
			throw new OrderingException("No valid comparator.");
		}
		Collections.sort(ls, c);
		return ls;
	}
	
}

