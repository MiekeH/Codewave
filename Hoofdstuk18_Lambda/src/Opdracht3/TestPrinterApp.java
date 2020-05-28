package Opdracht3;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestPrinterApp {

	public static void main(String[] args) {
	TextPrinter tp = new TextPrinter("these bloddy ryys");
	
	
	Predicate<String> condition1 = s->s.length() > 5;
	Predicate<String> condition2 = s->s.length() > 4;
	Predicate<String> condition3 = condition1.and(condition2);
	tp.printFilteredWords(condition3);
	
	//oefening 
	Predicate<String> condition4 = s->s.contains("e");
	Predicate<String> condition5 = s->s.contains("a");
	Predicate<String> condition6 = condition4.and(condition5);
	tp.printFilteredWords(condition6);
	
	//zet de woorden om in hoofdLetters 	
	Function<String,String> conditi1 = String::toUpperCase;
	Function<String,String> conditi2 = s-> s.replace("e","o");
	Function<StringBuilder,StringBuilder> conditi3 = s-> s.reverse();
	Predicate<String> conditi4 = conditi1.andThen(conditi2).andThen(conditi3);
	
	//hoe van string naar stringbuilder met functional interface?
	tp.printFilteredWords(conditi4);
	
	BigDecimal bd = new BigDecimal(0);
	
	Function<String,BigDecimal> conditi1 = s-> s.parse(bd);
	
	Function<String,BigDecimal> conditi2 = s-> s.replaceAll("e", "4");
	Function<String,BigDecimal> conditi3 = conditi2.andThen(conditi1);
	tp.printNumberValues(conditi3);
	//apply() methode object van type T wordt omgezet in een type R
	//tp.printProcessedWords(String::toUpperCase);
	tp.printNumberValues(BigDecimal::new);

	Consumer<String> print = System.out::println;
	tp.printFilteredWords(s-> String.format("<<%s>>", s),print);
	
	
	
	
	}

}
