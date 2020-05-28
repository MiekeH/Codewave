package Opdracht2;

import java.math.BigDecimal;

public class TextApp {

	public static void main(String[] args) {
	// alle woorden omgeven van tekens gebruik String.format
	TextPrinter tp = new TextPrinter("hi this is getting crazy ");
	TextPrinter printer = new TextPrinter("Crazy days in here and it's foony");
	tp.printProcessedWords(s -> String.format("<<%s>>", s));
	//tp.printProcessedWords (s -> TextUtil.quote(s));
	
	//methode referentie - zelfde aantal en type parameters
	// String WordProcessor.process(String s);
	//String TextUtil.quote(String s): 
		
	//tp.printProcessedWords(s -> TextUtil.reverse(s));

	//gebonden methode referentie, zorgt voor dat de text wordt uitgelijnd en onder elkaar staat
	TextPadder padder = new TextPadder(20);
	tp.printProcessedWords(s-> padder.pad(s)) ;
	
	//tekenreeks omzetten naar hoofdletters
	tp.printProcessedWords(s -> s.toUpperCase());
	tp.printProcessedWords(String::toUpperCase);
	
	//strings omzetten in bigdecimals
	TextPrinter tp2 = new TextPrinter ("123 145 675");
		
	
    printer.printScrambledWords(s -> s
            .replaceAll("a", "@")
            .replaceAll("e", "€")
            .replaceAll("l", "1")
            .replaceAll("o", "0"));
    printer.printProcessedWords(String::toUpperCase);
    printer.printProcessedWords(String::toLowerCase);
   
    printer.printReversedWords(s -> s.toString());
    
  // printer.printNumberValues(BigDecimal::new);
    //printer.printSum(BigDecimal::new);
	
}

}
