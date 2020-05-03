package be.intec.brussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Random;

public class RandomMeasurementGenerator implements MeasurementGenerator {
	Random randomTemp = new Random();
	int[] randomTC = randomTemp.ints(-70, 70).limit(1).sorted().toArray();
	Random randomLight = new Random();
	int[] randomLI = randomLight.ints(0, 10000).limit(1).sorted().toArray();

	Random randomHumidity = new Random();
	int[] randomHU = randomHumidity.ints(0, 100).limit(1).sorted().toArray();
		
		
		BigDecimal randomLightIntensity = new BigDecimal(Math.random());
		
			
	@Override
	public SensorMeasurement generateMeasurement() {
		final BigDecimal randomLightIntensity = new BigDecimal(randomInt(0,10_000));
		final BigDecimal randomHumidity = new BigDecimal(randomInt(0, 100));
        final BigDecimal randomTemperature = new BigDecimal(randomInt(-70, 70));
		SensorMeasurement sensors = new SensorMeasurement(randomHumidity, randomTemperature,randomLightIntensity);
		return sensors;
	}


	private int randomInt(final int upper, final int lower) {
		return (int) (Math.random() * (upper - lower)) + lower;
	}

	
}
