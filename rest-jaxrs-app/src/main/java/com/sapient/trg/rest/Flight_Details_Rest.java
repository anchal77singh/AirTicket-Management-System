package com.sapient.trg.rest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sapient.trg.model.Air_Flight_Details_Model;
import com.sapient.trg.model.Derived_Flight_Details_Model;
import com.sapient.trg.service.Derived_Flight_Details_Service;
import com.sapient.trg.service.Imp_Derived_Flight_Details_Service;

@Path("/flight")
public class Flight_Details_Rest {
	Imp_Derived_Flight_Details_Service service = new Derived_Flight_Details_Service();

	@POST
	@Path("/all_flight_info")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllFlight(RequestBody requestBody)
			throws SQLException
	{
		String fromLoc = requestBody.fromLoc;
		String toLoc = requestBody.toLoc;
		String departDate = requestBody.departDate;
		
		List<Derived_Flight_Details_Model> flightList = service.getAvailableFlights(fromLoc, toLoc, departDate);
		try {
			flightList = service.getAvailableFlights(fromLoc, toLoc, departDate);
			GenericEntity<List<Derived_Flight_Details_Model>> newFlightList= 
					new GenericEntity<List<Derived_Flight_Details_Model>> (flightList) {};
					return Response.ok(newFlightList).build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}


	}

	@GET
	@Path("/flightdetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFlightDetails(@QueryParam("flight_id") String flight_id) throws SQLException {
		try {			
			Air_Flight_Details_Model flightInfo = service.getFlightDetails(flight_id);
			GenericEntity<Air_Flight_Details_Model> flightDetail= 
					new GenericEntity<Air_Flight_Details_Model> (flightInfo) {};
					return Response.ok(flightDetail).build();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
	}

}
