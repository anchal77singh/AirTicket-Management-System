package com.sapient.trg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapient.trg.util.MySQLConnection;

public class BookingDAO implements Booking{

	@Override
	public String book(String from_location, String to_location, String flight_departure_date, String flight_id,String ticket_id,String profile_id,
			Integer available_seats) throws SQLException {
		try(
				Connection connection=MySQLConnection.getConnection();
				PreparedStatement preparedStatment= 
						connection.prepareStatement(QueryMapper.NUMBER_OF_SEAT);
				)
		{
			preparedStatment.setString(1, flight_departure_date);		

			ResultSet resultSet= preparedStatment.executeQuery();
			if(resultSet.getInt("available_seats") <= available_seats) 
			{
//				PreparedStatement Profile_Stmt= 
//						connection.prepareStatement("select profile_id from air_passenger_profile");
//				ResultSet rsProfile = Profile_Stmt.executeQuery();
//				if(rsProfile.next())
//				{
//					
//				}
				PreparedStatement Insert_Stmt= 
						connection.prepareStatement(QueryMapper.INSERT_TICKET_INFO,Statement. RETURN_GENERATED_KEYS);
				Insert_Stmt.setString(1, "ticket_id");
				Insert_Stmt.setString(2, "profile_id");
				Insert_Stmt.setString(3, "flight_id");
				Insert_Stmt.setString(4, "flight_departure_date");

				Insert_Stmt.executeUpdate();

				Integer noOfSeats = resultSet.getInt("available_seats");
				PreparedStatement Stmt= 
						connection.prepareStatement("update air_flight_details set available_seats = "+ (noOfSeats -available_seats));
				Stmt.executeUpdate();

				ResultSet rs= Insert_Stmt.getGeneratedKeys();
				if(rs.next()) {
					return "Booking Done successfully with Ticket ID = "+rs.getInt(1)+", Flight_ID = "+flight_id+", and number of seats = "+available_seats;
				}
				
			}
		}
			//Air_Flight_Details_Model flight = new Air_Flight_Detail
			catch(Exception e) {
				throw e;
			}
		return null;
		}

	}
