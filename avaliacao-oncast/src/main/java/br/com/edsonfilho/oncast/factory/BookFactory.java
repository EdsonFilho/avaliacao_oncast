package br.com.edsonfilho.oncast.factory;

import br.com.edsonfilho.oncast.bean.Book;

/**
 * Factory class that returns book objects
 * 
 * @author Edson Filho
 * @version 1.0
 */
public class BookFactory  {
	
	/**
	 * Return book one method.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public static Book getBook1(){
		Book b = new Book();
		b.setId(1);
		b.setTitle("Java How to Program");
		b.setAuthor("Deitel & Deitel ");
		b.setEditionYear("2007");
		return b;
	}
	
	/**
	 * Return book two method.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public static Book getBook2(){
		Book b = new Book();
		b.setId(2);
		b.setTitle("Patterns of Enterprise Application Architecture");
		b.setAuthor("Martin Fowler");
		b.setEditionYear("2002");
		return b;
	}
	
	/**
	 * Return book tree method.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public static Book getBook3(){
		Book b = new Book();
		b.setId(3);
		b.setTitle("Head First Design Patterns");
		b.setAuthor("Elisabeth Freeman");
		b.setEditionYear("2004");
		return b;
	}
	
	/**
	 * Return book four method.
	 * @author Edson Filho
	 * @since 1.0
	 */
	public static Book getBook4(){
		Book b = new Book();
		b.setId(4);
		b.setTitle("Internet & World Wide Web: How to Program");
		b.setAuthor("Deitel & Deitel ");
		b.setEditionYear("2007");
		return b;
	}
}
