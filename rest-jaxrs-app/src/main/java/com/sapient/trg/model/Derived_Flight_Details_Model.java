package com.sapient.trg.model;

import java.sql.Time;

public class Derived_Flight_Details_Model {
	private String flight_id;
	private String airline_name;
	private String from_location;
	private String to_location;
	private Time departure_time;
	private String flight_departure_date;
	private Time arrival_time;
	private Time duration;
	private Double price;
	private Integer available_seats;
	
	@Override
	public String toString() {
		return "Derived_Flight_Details_Model [flightID=" + flight_id + ", airlineName=" + airline_name + ", fromLoc="
				+ from_location + ", toLoc=" + to_location + ", departTime=" + departure_time + ", departDate=" + flight_departure_date
				+ ", arrivalTime=" + arrival_time + ", durationTime=" + duration + ", price=" + price
				+ ", availableSeats=" + available_seats + "]";
	}
	
	public String getFlightID() {
		return flight_id;
	}
	
	public void setFlightID(String flightID) {
		this.flight_id = flightID;
	}
	
	public String getAirlineName() {
		return airline_name;
	}
	
	public void setAirlineName(String airlineName) {
		this.airline_name = airlineName;
	}
	
	public String getFromLoc() {
		return from_location;
	}
	
	public void setFromLoc(String fromLoc) {
		this.from_location = fromLoc;
	}
	
	public String getToLoc() {
		return to_location;
	}
	
	public void setToLoc(String toLoc) {
		this.to_location = toLoc;
	}
	
	public Time getDepartTime() {
		return departure_time;
	}
	public void setDepartTime(Time departTime) {
		this.departure_time = departTime;
	}
	
	public String getDepartDate() {
		return flight_departure_date;
	}
	
	public void setDepartDate(String departDate) {
		this.flight_departure_date = departDate;
	}
	
	public Time getArrivalTime() {
		return arrival_time;
	}
	
	public void setArrivalTime(Time arrivalTime) {
		this.arrival_time = arrivalTime;
	}
	
	public Time getDurationTime() {
		return duration;
	}
	
	public void setDurationTime(Time durationTime) {
		this.duration = durationTime;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getAvailableSeats() {
		return available_seats;
	}
	
	public void setAvailableSeats(Integer availableSeats) {
		this.available_seats = availableSeats;
	}	

}
