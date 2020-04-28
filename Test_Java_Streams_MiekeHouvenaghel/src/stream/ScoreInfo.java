package stream;

public class ScoreInfo {
	private int score;
	private Student student;
	
	public ScoreInfo(int score, Student student) {
		this.score=score;
		this.student = student;
	}

	
	public int getScore() {
		return this.score;
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	
	@Override
	public String toString() {
		return "ScoreInfo [score=" + getScore() + ", student=" + getStudent() + "]";
	}
	
	
}
