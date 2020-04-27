package be.intec.brussel.lambdatest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeasurementApp {

	public static void main(String[] args) {
	List<RandomMeasurementGenerator> list = new ArrayList<> ();
	//Add casting from BigDecimal to int?
	SensorMeasurement sensor = new SensorMeasurement(65,34,1500);
	
	//example to print off even numbers in Lambda expressoion
	ArrayList<Integer> l = new ArrayList<Integer>();
	List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	
	
	
	}

}
