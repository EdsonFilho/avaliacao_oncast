package br.com.edsonfilho.oncast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.edsonfilho.oncast.bean.Book;
import br.com.edsonfilho.oncast.comparators.ByAuthorBookComparator;
import br.com.edsonfilho.oncast.comparators.ByEditionYearBookComparator;
import br.com.edsonfilho.oncast.comparators.ByTitleBookComparator;
import br.com.edsonfilho.oncast.exception.OrderingException;
import br.com.edsonfilho.oncast.factory.BookFactory;
import br.com.edsonfilho.oncast.sorter.BookSorter;
import br.com.edsonfilho.oncast.sorter.BookSorterImpl;

public class BookSorterTest extends TestCase {
	
	@Test
	public void testCaseOne() throws Throwable {
		
        Comparator<Book> comp = new ByTitleBookComparator();
        
        List<Book> s = new ArrayList<Book>();
        
        s.add(BookFactory.getBook1());
        s.add(BookFactory.getBook2());
        s.add(BookFactory.getBook3());
        s.add(BookFactory.getBook4());
        
        BookSorter bs = new BookSorterImpl();
        
        s = bs.sort(s, comp);
        
        String result = "";
        for(Book b: s){
        	result += b.getId()+"-";
        }
        
        assertEquals("Teste one done.", "3-4-1-2-", result);
        
	}
	
	@Test
	public void testCaseTwo() throws Throwable {
		
        Comparator<Book> comp = new ByAuthorBookComparator().asc(new ByTitleBookComparator().desc(null));
        
        List<Book> s = new ArrayList<Book>();
        
        s.add(BookFactory.getBook1());
        s.add(BookFactory.getBook2());
        s.add(BookFactory.getBook3());
        s.add(BookFactory.getBook4());
        
        BookSorter bs = new BookSorterImpl();
        
        s = bs.sort(s, comp);
        
        String result = "";
        for(Book b: s){
        	result += b.getId()+"-";
        }
        
        assertEquals("Teste two done.", "1-4-3-2-", result);
        
	}
	
	@Test
	public void testCasetTree() throws Throwable {
		
        Comparator<Book> comp = new ByEditionYearBookComparator().desc(new ByAuthorBookComparator().desc(new ByTitleBookComparator()));
        
        List<Book> s = new ArrayList<Book>();
        
        s.add(BookFactory.getBook1());
        s.add(BookFactory.getBook2());
        s.add(BookFactory.getBook3());
        s.add(BookFactory.getBook4());
        
        BookSorter bs = new BookSorterImpl();
        
        s = bs.sort(s, comp);
        
        String result = "";
        for(Book b: s){
        	result += b.getId()+"-";
        }
        
        assertEquals("Test tree done.", "4-1-3-2-", result);
        
	}
	
	
	@Test
	public void testCaseFour() {	
		
		Comparator<Book> comp = null;
        
        List<Book> s = new ArrayList<Book>();
        
        s.add(BookFactory.getBook1());
        s.add(BookFactory.getBook2());
        s.add(BookFactory.getBook3());
        s.add(BookFactory.getBook4());
        BookSorter bs = new BookSorterImpl();
        
        try{
        	s = bs.sort(s, comp);
        	assertTrue(false);
        }catch(OrderingException e){
        	assertTrue(true);
        }
        
	}
	
	@Test
	public void testCaseFive() throws Throwable {
		
        Comparator<Book> comp = new ByEditionYearBookComparator().desc(new ByAuthorBookComparator().desc(new ByTitleBookComparator()));
        
        List<Book> s = new ArrayList<Book>();
        
        BookSorter bs = new BookSorterImpl();
        
        s = bs.sort(s, comp);
        
        String result = "";
        for(Book b: s){
        	result += b.getId()+"-";
        }
        
        assertEquals("Test five done.", "", result);
        
	}
}
