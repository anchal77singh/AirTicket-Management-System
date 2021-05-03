package com.sapient.trg.model;

public class Air_Flight_Details_Model {
	private String flight_id;
	private String flight_departure_date;
	private Double price;
	private Integer available_seats;	
	
	public String getFlight_id() {
		return flight_id;
	}
	
	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}
	
	public String getFlight_departure_date() {
		return flight_departure_date;
	}
	
	public void setFlight_departure_date(String flight_departure_date) {
		this.flight_departure_date = flight_departure_date;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getAvailable_seats() {
		return available_seats;
	}
	
	public void setAvailable_seats(Integer available_seats) {
		this.available_seats = available_seats;
	}
	
	@Override
	public String toString() {
		return "Air_Flight_Details_Model [flight_id=" + flight_id + ", flight_departure_date=" + flight_departure_date
				+ ", price=" + price + ", available_seats=" + available_seats + "]";
	}
	
}
