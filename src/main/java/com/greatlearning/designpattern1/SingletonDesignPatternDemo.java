package com.greatlearning.designpattern1;

public class SingletonDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatabaseConnection con = DatabaseConnection.getInstance();
			
			if (con!=null){
				CrudServicesDAO crudServicesDAO = new CrudServicesDAO();
				crudServicesDAO.getAllUsers(con.getConnection().createStatement());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to get Connection!!!");;
		}

	}

}
