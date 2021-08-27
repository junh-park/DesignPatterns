package com.jun.structural.facade;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import com.jun.structural.facade.TravelFacade.BookingType;

public class TravelFacade {
	FlightBooking flightBooking;
	TrainBooking trainBooking;
	HotelBooking hotelBooking;
	
	enum BookingType {
		Flight, Train, Hotel, Flight_And_Hotel, Train_And_Hotel
	}

	public TravelFacade() {
		flightBooking = new FlightBooking();
		trainBooking = new TrainBooking();
		hotelBooking = new HotelBooking();
	}

	public void book(BookingType type, BookingInfo info) {
		switch (type) {
		case Flight:
			flightBooking.bookFlight(info);
			return;
		case Hotel:
			hotelBooking.bookHotel(info);
			return;
		case Train:
			trainBooking.bookTrain(info);
			return;
		case Flight_And_Hotel:
			flightBooking.bookFlight(info);
			hotelBooking.bookHotel(info);
			return;
		case Train_And_Hotel:
			trainBooking.bookTrain(info);
			hotelBooking.bookHotel(info);
			return;
		}
	}
}

class BookingInfo {
	String source;
	String destination;
	Date fromDate;
	Date toDate;
	List<PersonInfo> list;

	public BookingInfo(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	
}

class PersonInfo {
	String name;
	int age;
	Address address;
}

class Address {

}

class FlightBooking {

	public void bookFlight(BookingInfo info) {
		System.out.println("Flight booking completed departing from " + info.getSource() + " to " + info.getDestination());
	}

}

class TrainBooking {

	public void bookTrain(BookingInfo info) {
		System.out.println("Train booking completed departing from " + info.getSource() + " to " + info.getDestination());
	}

}

class HotelBooking {

	public void bookHotel(BookingInfo info) {
		System.out.println("Hotel booking completed in " + info.getDestination());

	}

	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();
		facade.book(BookingType.Flight_And_Hotel, new BookingInfo("Melbourne", "Seoul"));
	}
}