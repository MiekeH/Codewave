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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + count;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (count != other.count)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
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
