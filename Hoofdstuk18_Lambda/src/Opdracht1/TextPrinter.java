package Opdracht1;

public class TextPrinter {
	private String text;
	
	public TextPrinter(String text) {
		this.text=text;
	}
	
	public void printFilteredWords(WordFilter filter) {
		for(String w: text.split(" ")) {
			if (filter.isValid(w)) {
			System.out.println(w);	
			}
		}
		
	}

}
