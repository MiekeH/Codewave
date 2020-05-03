package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScoreInfoService {

	private ScoreInfo[] scoreData;
	private long numberOfStudents;

	public ScoreInfoService() {
	}

	public long getNumberOfStudents() {
		//return this.numberOfStudents;
		return Arrays.stream(this.scoreData).count();
	}

	public void addScoreInfo(ScoreInfo[] scoreData) {
		this.scoreData = scoreData;
		
//		this.scoreData = Arrays.copyOf(this.scoreData, this.scoreData.length + 1);
//        for (int i = 0; i < this.scoreData.length; i++) {
//            if (this.scoreData[i] == null) {
//                this.scoreData[i] = scoreData; //change into scoreInfo
//                break;
//            }
	
	}
		
	public void calculateAverageScore() {
		OptionalDouble avg = Stream.of(scoreData).mapToLong(ScoreInfo::getScore).average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : "Not available");
		System.out.println(avg);
	}
	
	
	public IntStream filterScore() {
		IntStream filterScore = Stream.of(scoreData)
				.filter(a-> a.getScore()>=90)
				.mapToInt(ScoreInfo::getScore);
		
		//other coding possible:return type should then be Long
//		return Arrays
//                .stream(this.scoreData)
//                .filter(scoreInfo -> (scoreInfo != null) && (scoreInfo.getScore() >= 90))
//                .count();
		
		
		return filterScore;
	}
	
	
	private String[] getFailingStudents () {
		String[] failingStudents = Stream.of(scoreData)
				.filter(s-> s.getScore() <60)
				.map(scoreData -> scoreData.getStudent().getLastName() + " " +scoreData.getStudent().getName())
				.toArray(String[]::new)
				;
	//other coding//
//	return Arrays
//			.stream(this.scoreData)
//			.filter(scoreData -> (scoreData !=null) && (scoreData.getScore() < 60))
//			.map(scoreData -> scoreData.getStudent().getLastName() + " " +scoreData.getStudent().getLastName())
//			.toArray(String[]::new);
			
	return failingStudents;
			                     
	}

	public void printFailingStudents() {
		Arrays.stream(getFailingStudents()).forEach(System.out::println);
	}

	public void getDataSortedByLastName() {
		Stream.of(this.scoreData)
				.map(s->s.getStudent().getLastName())
				.sorted()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// print namen en scores van de student per score
	public void getDataScoredByScore() {
		Arrays.stream(scoreData).forEach(System.out::println);

	}

	//codingYilmaz
	private ScoreInfo[] getDataSortedByScore2() {
        return Arrays
                .stream(this.scoreData)
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(ScoreInfo::getScore))
                .toArray(ScoreInfo[]::new);
    }
	
	private ScoreInfo[] getDataSortedByLastName2() {
        return Arrays
                .stream(this.scoreData)
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(scoreInfo -> scoreInfo.getStudent().getLastName()))
                .toArray(ScoreInfo[]::new);
    }
	
	public void printDataSortedByLastName2() {
        Arrays.stream(getDataSortedByLastName2()).forEach(System.out::println);
    }

    public void printDataSortedByScore2() {
        Arrays.stream(getDataSortedByScore2()).forEach(System.out::println);
    }
	
	
	
	
	
	@Override
	public String toString() {
		return "ScoreInfoService [scoreData=" + Arrays.toString(scoreData) + ", numberOfStudents=" + getNumberOfStudents()
				+ "]";
	}
	
	
	
	
}
