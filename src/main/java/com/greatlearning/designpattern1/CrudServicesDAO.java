package com.greatlearning.designpattern1;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CrudServicesDAO {
	List<User> userList = null;

	public void getAllUsers(Statement stmt) throws Exception {
		String query = "select id,fname,lname,email from Users";
		System.out.println("List of Users are:");
		ResultSet rs = stmt.executeQuery(query);
		int counter = 0;
		userList = new ArrayList<User>();
		while (rs.next()) {
			User user = new User(rs.getInt("id"), rs.getString("fname"), rs.getString("lname"), rs.getString("email"));
			userList.add(user);
			counter++;
		}
		System.out.println("Total Users = " + counter);
		userList.forEach(user -> System.out.println(user.toString()));

	}

}
