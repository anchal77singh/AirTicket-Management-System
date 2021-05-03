package com.sapient.trg.model;

import java.sql.Time;

public class Air_Flight_Model {
	private String flight_id;
	private String airline_id;
	private String airline_name;
	private String from_location;
	private String to_location;
	private Time departure_time;
	private Time arrival_time;
	private Time duration_time;
	private Integer total_seats;

	public String getFlight_id() {
		return flight_id;
	}
	
	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}
	
	public String getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(String airline_id) {
		this.airline_id = airline_id;
	}
	
	public String getAirline_name() {
		return airline_name;
	}
	
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	
	public String getFrom_location() {
		return from_location;
	}
	
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	
	public String getTo_location() {
		return to_location;
	}
	
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	
	public Time getDeparture_time() {
		return departure_time;
	}
	
	public void setDeparture_time(Time departure_time) {
		this.departure_time = departure_time;
	}
	
	public Time getArrival_time() {
		return arrival_time;
	}
	
	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}
	
	public Time getDuration_time() {
		return duration_time;
	}
	public void setDuration_time(Time duration_time) {
		this.duration_time = duration_time;
	}
	
	public Integer getTotal_seats() {
		return total_seats;
	}
	
	public void setTotal_seats(Integer total_seats) {
		this.total_seats = total_seats;
	}
	
	@Override
	public String toString() {
		return "Air_Flight_Model [flight_id=" + flight_id + ", airline_id=" + airline_id + ", airline_name="
				+ airline_name + ", from_location=" + from_location + ", to_location=" + to_location
				+ ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + ", duration_time="
				+ duration_time + ", total_seats=" + total_seats + "]";
	}
	
}
