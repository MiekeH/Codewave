package Opdracht2;

public class TextPadder {
	private int size;
	
	public TextPadder(int size) {
		this.size = size;
	}
	
	StringBuilder sb = new StringBuilder();
	public String pad(String s) {
	for(int i =0; i < size -s.length(); i++) {
	sb.append(' ');
	}
	sb.append(s);
	return sb.toString();
	
	}
}
