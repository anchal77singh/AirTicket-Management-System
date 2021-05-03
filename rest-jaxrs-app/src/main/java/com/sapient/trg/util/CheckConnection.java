package com.sapient.trg.util;

import java.sql.Connection;
import java.sql.SQLException;

public class CheckConnection {

	public static void main(String[] args) {
		try {
			Connection connection= MySQLConnection.getConnection();
			if(connection!=null) {
				System.out.println("Connection established");
			}else {
				System.out.println("Unable to connect");
			}
		}catch(SQLException  e) {
			e.printStackTrace();
		}

	}

}
