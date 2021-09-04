package com.jun.creational.builder.director;

import com.jun.creational.builder.*;
import com.jun.creational.builder.component.*;

public class Director {

	public void constructSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
}
