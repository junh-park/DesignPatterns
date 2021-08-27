package com.jun.behavioural.observer;

public class CurrentConditionalDisplay implements DisplayElement, Observer {
	private WeatherData weatherData;
	private float temp;
	private float humidity;

	public CurrentConditionalDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temp + "C degrees and " + humidity + "% humidity");
	}

	public void update() {
		this.temp = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}
	
}
