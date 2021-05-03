package com.sapient.trg.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.trg.model.Air_Flight_Details_Model;
import com.sapient.trg.model.Derived_Flight_Details_Model;

public interface Imp_Derived_Flight_Details_Service {
	public abstract List<Derived_Flight_Details_Model> getAvailableFlights(String fromLoc, String toLoc, String departDate) throws SQLException;
	public Air_Flight_Details_Model getFlightDetails(String flight_id) throws SQLException;
}
