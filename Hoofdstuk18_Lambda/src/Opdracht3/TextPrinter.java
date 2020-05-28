package Opdracht3;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {
private String sentence;
	
	public TextPrinter(String sentence) {
		this.sentence = sentence;
	}
	
	
	public void printFilteredWords(Predicate<StringBuilder> filter) {
		for (String word : sentence.split(" ")) {
			if (filter.test(word)) {
				System.out.println(word);
			}
		}
	}
	
	public void printFilteredWords(Predicate<String> filter,Consumer<String> printer) {
		for (String word : sentence.split(" ")) {
			if (filter.test(word)) {
				printer.accept(word);
			}
		}
	}
	
	
	
	
	public void printProcessedWords(Function<String, String> processor) {
		for(String word: sentence.split(" ")) {
			System.out.println(processor.apply(word));
		}
		
	}
	
	public void printNumberValues(Function<String, BigDecimal> parser) {
		for(String word: sentence.split(" ")) {
			System.out.println(String.format("%,d",parser.apply(word)));
		}
		
	
	}
	
}
	
	
	
	
	

