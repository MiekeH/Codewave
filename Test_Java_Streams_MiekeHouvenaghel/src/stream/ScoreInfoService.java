package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScoreInfoService {

	private ScoreInfo[] scoreData;
	private long numberOfStudents;

	public ScoreInfoService() {
	}

	public long getNumberOfStudents() {
		return this.numberOfStudents;
	}

	public void addScoreInfo(ScoreInfo[] scoreData) {
		this.scoreData = scoreData;
	}
		
	public void calculateAverageScore() {
		OptionalDouble avg = Stream.of(scoreData).mapToLong(ScoreInfo::getScore).average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : "Not available");
		System.out.println(avg);
	}
	
	//check how to call up this method
	public IntStream filterScore() {
		IntStream filterScore = Stream.of(scoreData)
				.filter(a-> a.getScore()>=90)
				.mapToInt(ScoreInfo::getScore);
				
		return filterScore;
	}
	
//	//check method:
//	private String[] getFailingStudents () {
//		String[] failingStudents = Stream.of(scoreData)
//				.filter(s-> s.getScore() <50)
//				.mapToInt(ScoreInfo::getStudent)
//				.toArray(String[]::new)
//				.forEach(System.out::println);
//	return failingStudents;
//	}

//	public void printFailingStudents() {
//		System.out.println(getFailingStudents());
//	}

//	public void getDataSortedByLastName() {
//		Stream.of(this.scoreData).filter(s -> s.getStudent().getLastName()).map(ScoreInfo::getLastName).sort()
//				.forEach(System.out::println);
//	}

	// print namen en scores van de student per score
	public void getDataScoredByScore() {
		Arrays.stream(scoreData).forEach(System.out::println);

	}

	@Override
	public String toString() {
		return "ScoreInfoService [scoreData=" + Arrays.toString(scoreData) + ", numberOfStudents=" + getNumberOfStudents()
				+ "]";
	}
	
	
	
	
}
