package youtube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class myComparator implements Comparator <Integer>{
	//ascending order:
	public int compare(Integer I1, Integer I2) {
		
		//return (I1 < I2) ? -1 : (I1 > I2) ?1: 0;
		
		if(I1 < I2)
		{		return -1;
		
		}
		else if (I1 > I2) {
			return +1;
		}
			else 
		{
				return 0;
		}
		}
		
	}




public class CollectionsLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(20);
		list.add(80);
		list.add(101);
		System.out.println(list);
		Comparator <Integer> c = (I1,I2) -> (I1 < I2) ? -1 : (I1 > I2) ?1: 0;
		//if used above lambda expression:
		Collections.sort(list,c);
		
		Collections.sort(list,(I1,I2) -> (I1 < I2) ? -1 : (I1 > I2) ?1: 0);
		
		//sort on alfabetical order
		Collections.sort(list,(e1,e2)-> e1.name.compareTo(e2.name));
		
		//find second highest salary for instane in list of employee ids
		
		//if used a class of Comparator
		Collections.sort(list,new myComparator ());
		System.out.println(list);
		list.stream().forEach(System.out::println);
		
		//even numbers afrpinten
		List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list2);
//		//ascending order, 50 20, so 50 comes before 20;
//		Comparato
//		int compare(Object object1; Object object2);
		
		//returns negative value if object1 has to come before object2; else positive value
		
		

	}

}
