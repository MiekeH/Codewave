package be.intec.brussel.lambdatest.model;


import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;


public class BookApp {

	public static void main(String[] args) {
		
		Person person1 = new Person("Julie", "Magki",LocalDate.of(1984, 10, 10));
		Person person2 = new Person("Julie", "Magki",LocalDate.of(1978, 10, 10));
		Person person3 = new Person("Julie", "Magki",LocalDate.of(1954, 10, 10));
		Person person4 = new Person("Julie", "Magki",LocalDate.of(1990, 10, 10));
		Person person5 = new Person("Julie", "Magki",LocalDate.of(1929, 10, 10));
				
		Book [] books = {
				new Book("Crazy dayz", person1,LocalDate.of(2020, 07, 3),"Science Fiction"),
				new Book("Crazy dayz", person2,LocalDate.of(1988, 04, 3),"Humor"),
				new Book("Crazy dayz", person3,LocalDate.of(2010, 04, 3),"Thriller"),
				new Book("Crazy dayz", person4,LocalDate.of(2009, 05, 3),"Drama"),
				new Book("feel good", person5,LocalDate.of(2000, 9, 25),"Musical")
				};
		
		
		System.out.println(Arrays.toString(books));
		
		for(Book b: books) {
		System.out.println(Arrays.toString(books));
		}
	
	}
	
		public Book getNewestBook(Book[] books) {
		Arrays.sort(books,
				(a,b)-> a.getReleaseDate().compareTo(b.getReleaseDate()) );		
				return books[4];
		}
		
		
		//sort by age and print off youngest
		public static void printYoungestWriter(Book[] books) {
		Arrays.sort((books,
				(a,b)-> {((Book) a).getAuthor().getDateOfBirth().compareTo(((Book) b).getAuthor().getDateOfBirth());
		
		Period p = Period.between(((Book) a).getAuthor().getDateOfBirth(),((Book) b).getAuthor().getDateOfBirth());
		System.out.println(p.getYears());
		System.out.println(books[0]);
		
				});
					
		}
		
		
		//sortbyTitle and print off books
		public void printSortedByTitle(Book[] books) {
			Arrays.sort(books, (a,b)-> a.getTitle().compareTo(b.getTitle()));
			System.out.println(books);
		
		
		//print getCOunt per author
		public void countBooksPerAuthor (Book[] books) {
			Arrays.sort(books, (a,b)-> a.getCount().compareTo(b.getCount()));
			System.out.println(getAuthor());
		}

		//print off book released in 2016
		public void printBooksReleasedIn2016(Book[] books) {
			Arrays.sort(books, (a)-> a.getReleaseDate().contains("2016"));
			System.out.println(books);
		}

	}
}

