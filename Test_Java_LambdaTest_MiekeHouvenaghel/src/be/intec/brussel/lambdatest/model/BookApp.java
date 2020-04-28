package be.intec.brussel.lambdatest.model;


import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.stream.Collectors;


public class BookApp {

	public static void main(String[] args) {
		//to Convert to new Array
//		Book[] newBooks =
//				Arrays.stream(books).filter(a -> a.getReleaseDate().getYear()==2016).toArray(Book[]::new);
//		Arrays.stream(books).filter(a -> a.getAuthor().equals("author")).toArray();
//		int count = books.length;
				
		Person person1 = new Person("Julie", "Magki",LocalDate.of(1984, 10, 10));
		Person person2 = new Person("Julie", "Magki",LocalDate.of(1978, 10, 10));
		Person person3 = new Person("Julie", "Magki",LocalDate.of(1954, 10, 10));
		Person person4 = new Person("Julie", "Magki",LocalDate.of(1990, 10, 10));
		Person person5 = new Person("Julie", "Magki",LocalDate.of(1929, 10, 10));
				
		Book [] books = {
				new Book("Crazy dayz", person1,LocalDate.of(2020, 07, 3),"Science Fiction"),
				new Book("Crazy dayz", person1,LocalDate.of(1988, 04, 3),"Humor"),
				new Book("Crazy dayz", person3,LocalDate.of(2016, 04, 3),"Thriller"),
				new Book("Crazy dayz", person4,LocalDate.of(2009, 05, 3),"Drama"),
				new Book("feel good", person5,LocalDate.of(2000, 9, 25),"Musical")
				};
		
		System.out.println("Print newest book: " +getNewestBook(books));
		printYoungestWriter(books);
		countBooksPerAuthor(books);
		printBooksReleasedIn2016(books);
		
		System.out.println("print off entire list--------");
		Arrays.stream(books).count();
	
		Arrays.stream(books).forEach(System.out::println);
		System.out.println(Arrays.toString(books));
		
		for(Book b: books) {
		System.out.println(Arrays.toString(books));
		}
	
	}
	
		public static Book getNewestBook(Book[] books) {
		Arrays.sort(books,
				(a,b)-> a.getReleaseDate().compareTo(b.getReleaseDate()) );		
				return books[4];
		}
		
		public static void printYoungestWriter(Book[] books) {
		Arrays.sort(books,(a,b)-> a.getAuthor().getDateOfBirth().compareTo(b.getAuthor().getDateOfBirth()));
		System.out.println("print youngest" +books[4]);
			
		}
				
//		public static void printSortedByTitle(Book[] books) {
//			Arrays.sort(books, (a,b)-> a.getTitle().compareTo(b.getTitle()));
//			System.out.println("sorted by title" +books);
//		}
		
		public static void countBooksPerAuthor (Book[] books) {
			Book[] newBooks = (Book[]) Arrays.stream(books).filter(a -> a.getAuthor().equals("author")).toArray(Book[]::new);
			int count = newBooks.length;
			
//			Arrays.stream(books)
//			.count()
//			.filter(a-> a.getAuthor().equals("author"))
//			.collect(Collectors.toList())
//			.forEach(System.out::println);			
		
			
			System.out.println("authorname: " +count +newBooks);
		}

		public static void printBooksReleasedIn2016 (Book[] books) {
//			Book[] newBooks = Arrays.stream(books)
//			.filter(a -> a.getReleaseDate().getYear()==2016).toArray(Book[]::new);
//			System.out.println("printbook in 2016" +newBooks);	
			
			System.out.println("print off book from 2016");
			Arrays.stream(books)
			.filter(a -> a.getReleaseDate().getYear()==2016).collect(Collectors.toList()).forEach(System.out::println);
						
		}

	}


