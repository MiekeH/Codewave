package be.intec.brussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomMeasurementGenerator implements MeasurementGenerator {

	//Generator Randommeasurementgenerator zal in de methode generateMeasurement een willekeurige measurment genereren. De willekeurige waarden liggen zijn wel begrenst: 
//Humidity moet tussen de 0 en de 100% liggen 
//LightIntensity moet tussen de 0 en de 10000 lumen liggen 
//Temperature moet tussen de -70 en 70 graden liggen 
	
	//Intstream.iterate(0,i-> i+1);
	
	Random randomHumidity = new Random();	
	int[] randomHNumbers = randomHumidity.ints(0,100)
			.limit(1)
			.sorted()
			.toArray();
	Random randomLight = new Random();	
	int[] randomLIntensity = randomLight.ints(0,10000)
			.limit(1)
			.sorted()
			.toArray();
	
	Random randomTemp = new Random();	
	int[] randomTCelsius = randomTemp.ints(-70,70)
			.limit(1)
			.sorted()
			.toArray();
	
	
	
	
	@Override
	public SensorMeasurement generateMeasurement() {
				
		BigDecimal randomHumidity = new BigDecimal(Math.random();
		BigDecimal MINRandomHumidity = 
		BigDecimal randomTemperatureCelsius = new BigDecimal(Math.random());
		BigDecimal randomLightIntensity = new BigDecimal(Math.random());
			
		SensorMeasurement sensorsData = new SensorMeasurement(randomHumidity, randomTemperatureCelsius,randomLightIntensity);
		
		IntStream tc = IntStream.rangeClosed(-70,70);
		
		//set scale? //between x and y?hoe range definieren?
				
		return sensorsData;
	}

	
}
