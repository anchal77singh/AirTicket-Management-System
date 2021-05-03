package com.sapient.trg.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.trg.model.Air_Flight_Details_Model;
import com.sapient.trg.model.Derived_Flight_Details_Model;


public interface FlightDetails {
	public abstract List<Derived_Flight_Details_Model> getAvailableFlights(String fromLoc,
	 String toLoc,String departDate) throws SQLException;
	public abstract Air_Flight_Details_Model getFlightDetails(String flight_id) throws SQLException;

	
}

