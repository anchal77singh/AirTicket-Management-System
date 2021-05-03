package com.sapient.trg.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.trg.dao.FlightDetails;
import com.sapient.trg.dao.FlightDetailsDAO;
import com.sapient.trg.model.Air_Flight_Details_Model;
import com.sapient.trg.model.Derived_Flight_Details_Model;

public class Derived_Flight_Details_Service implements Imp_Derived_Flight_Details_Service{
	FlightDetails flightDetails=new FlightDetailsDAO();
	
	@Override
	public List<Derived_Flight_Details_Model> getAvailableFlights(String fromLoc, String toLoc, String departDate) throws SQLException{
		try {
			return flightDetails.getAvailableFlights(fromLoc, toLoc, departDate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
	}

	@Override
	public Air_Flight_Details_Model getFlightDetails(String flight_id) throws SQLException {
		// TODO Auto-generated method stub
		return flightDetails.getFlightDetails(flight_id);
	}	

}
