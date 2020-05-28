package Opdracht1;

public class TextApp {

	public static void main(String[] args) {
		final String c = "a";
		
		//final String d = charAt(1,"a");
		
		TextPrinter tp = new TextPrinter("Hi all very nice day since 1996");
		tp.printFilteredWords(new WordFilter() {
			public boolean isValid(String s) {
			return s.contains(c);
			
			}
			});
		
		//code without lambda expression
		System.out.println("**** WORDS WITH MORE THAN 4 LETTERS *****");
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.length() > 4;
            }
        });
		
		
		
		
		
		//Lambda expression
		tp.printFilteredWords((s) -> s.contains("96"));
		tp.printFilteredWords(s -> s.length() > 4);
		tp.printFilteredWords(s -> s.startsWith(c));
		
		//woorden die als tweede letter 'e' hebben
		tp.printFilteredWords(s -> s.substring(1).contains("e"));
		
		//woorden die twee keer letter 'e' bevatten
		tp.printFilteredWords(s -> s.matches(".*a.*a."));
		
		
		tp.printFilteredWords(new WordFilter() {
		
			public boolean isValid(String s) {
			return s.contains(c);
			
			}
			});
		

	}

	private static String charAt(int i, String string) {
		String d = charAt(1,"e");
		return d;
	}

}
