package be.intec.brussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Random;

public class RandomMeasurementGenerator implements MeasurementGenerator {

	//Generator Randommeasurementgenerator zal in de methode generateMeasurement een willekeurige measurment genereren. De willekeurige waarden liggen zijn wel begrenst: 
//Humidity moet tussen de 0 en de 100% liggen 
//LightIntensity moet tussen de 0 en de 10000 lumen liggen 
//Temperature moet tussen de -70 en 70 graden liggen 
	
	
	
	@Override
	public SensorMeasurement generateMeasurement() {
				
		BigDecimal randomHumidity = new BigDecimal(Math.random();
		BigDecimal MINRandomHumidity = 
		BigDecimal randomTemperatureCelsius = new BigDecimal(Math.random());
		BigDecimal randomLightIntensity = new BigDecimal(Math.random());
			
		SensorMeasurement sensorsData = new SensorMeasurement(randomHumidity, randomTemperatureCelsius,randomLightIntensity);
		
		//set scale? //between x and y?hoe range definieren?
				
		return sensorsData;
	}

	
}
