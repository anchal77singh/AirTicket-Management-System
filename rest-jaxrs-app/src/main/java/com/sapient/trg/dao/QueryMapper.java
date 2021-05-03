package com.sapient.trg.dao;

public interface QueryMapper {
	String GET_ALL_FLIGHT_INFO = "SELECT afd.flight_id, af.airline_name, af.from_location, af.to_location, afd.flight_departure_date, af.departure_time , af.arrival_time , af.duration, afd.price, afd.available_seats from air_flight af JOIN air_flight_details afd WHERE af.from_location = ? AND af.to_location = ? AND afd.available_seats > 0 AND afd.flight_departure_date = ? ORDER BY af.flight_id,af.from_location";
	String CHECK_SEAT = "SELECT flight_id, price, available_seats, flight_departure_date FROM air_flight_details where flight_id = ?";
	String INSERT_CARD = "INSERT INTO AIR_CREDIT_CARD (profile_id, card_number, card_type, expiration_month, expiration_year) VALUES (?,?,?,?,?)";
	String NUMBER_OF_SEAT = "SELECT available_seats from air_flight_details where flight_departure_date = ?";
	String INSERT_TICKET_INFO = "INSERT INTO AIR_TICKET_INFO (ticket_id, profile_id,flight_id,flight_departure_date,status) VALUES (?,?,?,?,'BOOKED')";
}

