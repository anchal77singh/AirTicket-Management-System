package com.sapient.trg.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sapient.trg.model.Air_Flight_Details_Model;
import com.sapient.trg.model.Derived_Flight_Details_Model;
import com.sapient.trg.util.MySQLConnection;

public class FlightDetailsDAO implements FlightDetails {

	private void populateFlightDetail(ResultSet resultSet,Derived_Flight_Details_Model flightDetail)throws SQLException{
		//populate User object by getting data from ResultSet object
		flightDetail.setFlightID(resultSet.getString("flight_id"));
		flightDetail.setAirlineName(resultSet.getString("airline_name"));
		flightDetail.setFromLoc(resultSet.getString("from_location"));
		flightDetail.setToLoc(resultSet.getString("to_location"));
		flightDetail.setDepartDate(resultSet.getString("flight_departure_date"));
		flightDetail.setDepartTime(resultSet.getTime("departure_time"));
		flightDetail.setArrivalTime(resultSet.getTime("arrival_time"));
		flightDetail.setDurationTime(resultSet.getTime("duration"));
		flightDetail.setPrice(resultSet.getDouble("price"));
		flightDetail.setAvailableSeats(resultSet.getInt("available_seats"));

	}


	@Override
	public List<Derived_Flight_Details_Model> getAvailableFlights(String fromLoc, String toLoc, String departDate) throws SQLException
	{
		try(
				Connection connection=MySQLConnection.getConnection();
				PreparedStatement preparedStatment= 
						connection.prepareStatement(QueryMapper.GET_ALL_FLIGHT_INFO);
				){

			preparedStatment.setString(1, fromLoc);
			preparedStatment.setString(2, toLoc);
			preparedStatment.setString(3, departDate);

			ResultSet resultSet= preparedStatment.executeQuery();
			List<Derived_Flight_Details_Model> flightList=new ArrayList<>();

			while(resultSet.next()) {
				Derived_Flight_Details_Model flightDetail=new Derived_Flight_Details_Model ();
				populateFlightDetail(resultSet,flightDetail);
				flightList.add(flightDetail);										
			}
			if(flightList.size()==0) {			
				throw new SQLException("Table is empty");
			}
			return flightList;

		}catch(SQLException e) {
			//e.printStackTrace();
			throw e;
		}
	}


	@Override
	public Air_Flight_Details_Model getFlightDetails(String flight_id) throws SQLException{
		try(
				Connection connection=MySQLConnection.getConnection();
				PreparedStatement preparedStatment= 
						connection.prepareStatement(QueryMapper.CHECK_SEAT);
				){
			preparedStatment.setString(1, flight_id);
			ResultSet resultSet= preparedStatment.executeQuery();
			Air_Flight_Details_Model flight = new Air_Flight_Details_Model();
			while(resultSet.next())
			{
				flight.setAvailable_seats(resultSet.getInt("available_seats"));
				flight.setPrice(resultSet.getDouble("price"));
				flight.setFlight_id(resultSet.getString("flight_id"));
				flight.setFlight_departure_date(resultSet.getString("flight_departure_date"));	
			}

			return flight;
		}
		catch(Exception e) {
			throw e;
		}
	}


}

