package br.com.edsonfilho.oncast.bean;

/**
 *  Book class - Java Bean
 * 
 * @author Edson Filho
 * @version 1.0
 */
public class Book {
	
	private int id;
	private String title;
	private String Author;
	private String EditionYear;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public String getEditionYear() {
		return EditionYear;
	}
	
	public void setEditionYear(String editionYear) {
		EditionYear = editionYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
	    if(!(obj instanceof Book)) return false;
	    Book other = (Book) obj;
	    return this.id == other.id;
	}
	@Override
	public int hashCode() {
		return (int) this.id;
	}
	
}
