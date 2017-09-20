package com.hari;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.beans.factory.InitializingBean;

public class DbInitializer  implements InitializingBean{

public void afterPropertiesSet() throws Exception {
		
		String dbURL = "jdbc:h2:~/test;create=true";
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			
			conn = DriverManager.getConnection(dbURL,"sa","");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Drop TABLE Customers ");

			stmt.executeUpdate("CREATE TABLE Customers (id integer,firstName VARCHAR(255), lastName VARCHAR(255), city VARCHAR(255),country VARCHAR(255),postcode integer)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('1','hari','s','sydney','Australia',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('2','Siva','v','Bangalore','India',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('3','hari','s','sydney','Australia',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('4','Siva','v','Bangalore','India',56002)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('5','hari','s','sydney','Australia',56003)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('6','Siva','v','Bangalore','India',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('7','hari','s','sydney','Australia',56004)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('8','Siva','v','Bangalore','India',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('9','hari','s','sydney','Australia',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('10','Siva','v','Bangalore','India',56005)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('11','hari','s','sydney','Australia',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('12','Siva','v','Bangalore','India',56001)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('13','hari','s','sydney','Australia',56006)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('14','Siva','v','Bangalore','India',56003)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('15','hari','s','sydney','Australia',56006)");
			stmt.executeUpdate("insert into  Customers (id,firstName , lastName , city ,country,postcode) values('16','Siva','v','Bangalore','India',56003)");
			
		} 
		catch (java.sql.SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		}
}
}
