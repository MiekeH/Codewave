package be.intec.brussel.lambdatest.model;

import java.math.BigDecimal;

public class SensorMeasurement {
	private BigDecimal humidity;
	private BigDecimal temperature;
	private BigDecimal lightintensity;
	
	public SensorMeasurement(BigDecimal humidity, BigDecimal temperature, BigDecimal lightintensity) {
		this.humidity = humidity;
		this.lightintensity = lightintensity;
		this.temperature = temperature;
	}
	
	public BigDecimal getHumidity() {
		return this.humidity;
	}

	public BigDecimal getLightIntensity() {
		return lightintensity;
	}

	public BigDecimal getTemperatureCelsius() {
		return this.temperature;
	}

	public void setScaleTemperature(BigDecimal temperatureCelsius) {
	this.temperature.scale();
	//hoe min en max 
	
	}
	
	
	
	
	public BigDecimal getTemperatureFahrenheit() {
		BigDecimal temperatureCelsius = this.temperature;
		BigDecimal temperatureFahrenheit = temperatureCelsius.multiply((1.8)).plus(32);
		return temperatureFahrenheit;
	}
	
	//maakt een array aan met numberOfMeasurments willekeurige Measurement objecten
	
	public SensorMeasurement[] generateMeasurementArray(int numberOfMeasurements) {
		SensorMeasurement[] sensorMeasurement = new SensorMeasurement[numberOfMeasurements];
		for (int i = 0; i < numberOfMeasurements; i++) {
			sensorMeasurements[i] = randy.nextInt(numberOfMeasurements) + 1;
		}

		// invullen met willekeurige objecten van randomgenerator
		return sensorMeasurement;
	}

	// print print de hoogste temperatuur af in celcius en Fahrenheit
	//BigDecimal max(temperature)?
	public void printHighestTemperature(SensorMeasurement[] sensor) {
		//nakijken in de loop, dan kijken welke de grootste en afprinten
		for(SensorMeasurement[] sensor: ) {
			if(((Object) temperature).isHighest()) {
				System.out.println(temperature);
			}
		}
		
		
			}
			
	// sorteert de array volgens oplopende lichtintensiteit. Tot slot print hij ze
	// af //anonymous geneste classe
	// compare method
	public void printSortedByLightIntensity(SensorMeasurement[] sensor) {

	}

	// measurement Array om naar een String array.
	public String[] mapToInfoString(SensorMeasurement[] sensor) {

		return -1;
	}

	public void printAverageTemperature(SensorMeasurement[] sensor) {

	}
	
		
	@Override
	public String toString() {
		return "SensorMeasurement [humidity= %" + humidity + ", temperature=" + temperature + ", lightintensity="
				+ lightintensity + "]";
	}

	
	
	
	
	
}


