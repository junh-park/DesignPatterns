package com.jun.behavioural.observer;

public class HeatIndexDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private WeatherData weaterData;

	public HeatIndexDisplay(WeatherData weaterData) {
		this.weaterData = weaterData;
		weaterData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Heat index is " + calculateHeatIndex(temp, humidity));
	}

	public void update() {
		this.temp = weaterData.getTemperature();
		this.humidity = weaterData.getHumidity();
		display();
	}

	public float calculateHeatIndex(float T, float humidity) {
		double heatindex = 16.923 + 1.85212 * 10-1 * T + 5.37941 * humidity - 1.00254 * 10-1 *
		T * humidity + 9.41695 * 10-3 * Math.pow(T,2) + 7.28898 * 10-3 * Math.pow(humidity,2) + 3.45372 *
		10-4 * Math.pow(T,2) * humidity - 8.14971 * 10-4 * T * Math.pow(humidity,2) + 1.02102 * 10-5 * Math.pow(T,2) *
				Math.pow(humidity,2) - 3.8646 * 10-5 * Math.pow(T,3) + 2.91583 * 10-5 * Math.pow(humidity,3) + 1.42721 * 10-6
		* Math.pow(T,3) * humidity + 1.97483 * 10-7 * T * Math.pow(humidity,3) - 2.18429 * 10-8 * Math.pow(T,3) * Math.pow(humidity,2)
		+ 8.43296 * 10-10 * Math.pow(T,2) * Math.pow(humidity,3) - 4.81975 * 10-11 * Math.pow(T,3) * Math.pow(humidity,3);
		
		return (float) heatindex;
	}

}
