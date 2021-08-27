package com.jun.behavioural.observer;

public class TestWeatherData {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionalDisplay currentDisplay = new CurrentConditionalDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
