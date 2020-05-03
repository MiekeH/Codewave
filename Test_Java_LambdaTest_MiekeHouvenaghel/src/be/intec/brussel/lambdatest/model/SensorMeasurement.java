package be.intec.brussel.lambdatest.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SensorMeasurement {
	private BigDecimal humidity;
	private BigDecimal temperature;
	private BigDecimal lightintensity;
	
	public SensorMeasurement(BigDecimal humidity, BigDecimal temperature, BigDecimal lightintensity) {
		this.humidity = humidity;
		this.lightintensity = lightintensity;
		this.temperature = temperature;
	}
	
	public double getHumidity() {
		//add formatting to double value?
		return this.humidity.doubleValue();
	}

	public double getLightIntensity() {
		//add formatting
		return lightintensity.doubleValue();
	}

	//converted to double value
	public double getTemperatureCelsius() {
		//add formatting
		return this.temperature.doubleValue();
	}

	public double getTemperatureFahrenheit() {
		double temperatureFahrenheit = (getTemperatureCelsius() * 1.8) + (32);
		return temperatureFahrenheit;
	}
	
	//maakt een array aan met numberOfMeasurments willekeurige Measurement objecten
	public SensorMeasurement[] generateMeasurementArray(int numberOfMeasurements) {
		final MeasurementGenerator generator = new RandomMeasurementGenerator();
		SensorMeasurement[] sensorMeasurement = new SensorMeasurement[numberOfMeasurements];
		for (int i = 0; i < sensorMeasurement.length; i++) {
			//sensorMeasurement[i] = Random.nextInt(numberOfMeasurements) + 1;
			sensorMeasurement[i] = generator.generateMeasurement();
		}
		return sensorMeasurement;
	}

	public void printHighestTemperature(SensorMeasurement[] sensor) {
	Optional<SensorMeasurement> numberMaxTC= Stream.of(sensor)
				.filter(s->s.getTemperatureCelsius())
				.max();
	
	Optional<SensorMeasurement> max = Arrays
            .stream(measurements)
            .max(Comparator.comparing(measurement -> measurement.getTemperature(true)));

    max.ifPresent(measurement ->
            out.println("The highest temperature is " +
                    df2.format(measurement.getTemperature(true).doubleValue()) +
                    " in fahrenheits, " +
                    df2.format(measurement.getTemperature(false).doubleValue()) +
                    " in celsius"));
	(numberMaxTC.isPresent() ? numberMaxTC.getAsDouble() :"no values");
	
	OptionalInt numberMaxTF= Stream.of(sensor)
			.filter(s->s.getTemperatureFahrenheit())
			.max();
	(numberMaxTF.isPresent() ? numberMaxTF.getAsDouble() :"no values");
	
	}

	public void printSortedByLightIntensity(final SensorMeasurement[] sensor) {
		Stream.of(sensor)
		.sorted(Comparator.comparingDouble(SensorMeasurement::getLightIntensity));
		
		Arrays.stream(sensor).forEach(System.out::println);
	}

	
	public String[] mapToInfoString(SensorMeasurement[] sensor) {
		String[] mapToInfoString = 
				(String[]) Stream.of(sensor)
				.map(s-> (s.getHumidity() + " " 
						+ s.getLightIntensity()+ " "+s.getTemperatureCelsius() ))
				
				.toArray(String[]::new);
		
		return mapToInfoString;
	}

	public void printAverageTemperature(SensorMeasurement[] sensor) {
		OptionalDouble avg = Stream.of(sensor)
				.mapToDouble(s-> s.getTemperatureCelsius())
				.average();
		System.out.println(avg.isPresent() ? avg.getAsDouble() : "Not available");
	}
			
	@Override
	public String toString() {
		return "SensorMeasurement [humidity= %" + humidity + ", temperature=" + temperature + ", lightintensity="
				+ lightintensity + "]";
	}

	
	
	
	
	
}


