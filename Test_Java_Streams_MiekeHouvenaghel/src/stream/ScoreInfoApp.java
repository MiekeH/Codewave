package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfoApp {

	public static void main(String[] args) {
	Student student1 = new Student("Charlie", "Bwooz");
	Student student2 = new Student("Helmut", "Helm");
	Student student3 = new Student("Billi", "Milli");
	Student student4 = new Student("Bunny", "Chao");
	Student student5 = new Student("Sunnyboy", "Long");
	
	ScoreInfo [] score = {
			new ScoreInfo(98,student1),
			new ScoreInfo(88,student2),
			new ScoreInfo(95,student3),
			new ScoreInfo(48,student4),
			new ScoreInfo(78,student5)
			};
	//other coding to set up as List-as a reference	
	List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("X", "Y"),
            new Student("A", "B")));
     
	
	ScoreInfoService si = new ScoreInfoService();
	
	System.out.println("Add scoreInfo to scoreInfo--------");
	si.addScoreInfo(score);
	
	System.out.println("Print number of students----------");
	System.out.println(Arrays.stream(score).count());
	
	System.out.println("Print high scores----------");
	List<ScoreInfo> list2 = Arrays.stream(score).filter(i->i.getScore()>=90).collect(Collectors.toList());
	System.out.println(list2);
	si.filterScore();
	
	System.out.println("Print data by score----------");
	si.getDataScoredByScore();
		
	System.out.println("Print avg-------- score--");
	si.calculateAverageScore();	
	
	System.out.println("Print students score below 60---------");
	Arrays.stream(score)
		.filter(a -> a.getScore() <= 50) 
		.collect(Collectors.toList())
		.forEach(System.out::println);
	
	si.printFailingStudents();
	
	System.out.println("Data sorted by LastName---------");
	si.getDataSortedByLastName();
	si.printDataSortedByLastName2();
	si.printDataSortedByScore2();
			
	System.out.println("Check if id set up work-----------");
	System.out.println("Studentnr" +student4.getId());

	
	
	
	
	}
	
}
