package Opdracht2;

import java.math.BigDecimal;

public class TextPrinter {
	private String sentence;
	
	public TextPrinter(String sentence) {
		this.sentence = sentence;
	}
	
	public void printProcessedWords(WordProcessor processor) {
		for (String word : sentence.split(" ")) {
			System.out.println(processor.process(word));
		}
	}
		
	public void printNumberValues(NumberParser parser) {
		for(String word : sentence.split(" ")) {
			System.out.format ("%, d%n", parser.parse(word));
			
		}
	}
	
	//printsum na replace values in cijfers parsing
	public void printSum(NumberParser parser) {
		BigDecimal total = new BigDecimal(0);
		for(String word : sentence.split(" ")) {
		String decimal = word.replaceAll("[^0-9]", "");
        if (!decimal.isEmpty()) {
            total = total.add(parser.parse(decimal));
        	}
		}
        System.out.println(total);
		}
	
	public void printScrambledWords(TextScrambler scrambler) {
        for (String word : splitWords()) {
            System.out.print(scrambler.scramble(word) + " ");
        }
        System.out.println();
    }

	
	
	private String[] splitWords() {
		return sentence.split (" ");
	}
	
	
	StringBuilder builder = new StringBuilder();
	public void printReversedWords(TextUtil utility) {
		for (String word : splitWords()) {
            builder.append(word).append(" ");
            builder.reverse();
        }
        System.out.println(utility.reverse(builder));
    
	}
	
	
	

}

	
	
	

