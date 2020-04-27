package be.intec.brussel.lambdatest.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Comparator;

public class Book implements Comparable<Book>{
	private String title;
	private Person author;
	private LocalDate releaseDate;
	private String genre;
	private int count;
	
	
	public Book(String title, Person author, LocalDate releaseDate, String genre) {
		this.title=title;
		this.author = author;
		this.releaseDate = releaseDate;
		this.genre = genre;
		count = getCount() + 1;
	}
		
	public String getTitle() {
		return this.title;
	}
	
	public Person getAuthor() {
		return this.author;
	}
	
	public LocalDate getReleaseDate() {
		return this.releaseDate;
	}

	public String getGenre() {
		return genre;
	}

	
	public Book getNewestBook(Book[] books) {
		Arrays.sort(books,
				(a,b)-> a.getReleaseDate().compareTo(b.getReleaseDate()) );		
				return books[4];
		}
	
	@Override
	public int compareTo(Book book) {
		return this.title.compareTo(book.title);
	}

	@Override
	public String toString() {
		
		return "Book [title=" + getTitle() + ", author=" +getAuthor() + ", releaseDate=" + getReleaseDate() + ", genre=" + getGenre()
				+ "]";
	}

	public int getCount() {
		return count;
	}
	
	
	
}
