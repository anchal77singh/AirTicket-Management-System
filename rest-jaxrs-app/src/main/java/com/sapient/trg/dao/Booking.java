package com.sapient.trg.dao;

import java.sql.SQLException;

public interface Booking {
	public abstract String book(String from_location, String to_location, String flight_departure_date, String flight_id,String ticket_id,String profile_id,
			Integer available_seats) throws SQLException;	
}
