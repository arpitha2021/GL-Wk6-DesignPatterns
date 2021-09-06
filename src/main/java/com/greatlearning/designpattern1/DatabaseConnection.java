package com.greatlearning.designpattern1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
  private static DatabaseConnection DB_INSTANCE;
  private Connection connection;
  private String url = "jdbc:mysql://localhost:3306/Users";
  private String username = "root";
  private String password = "password@121";
  private DatabaseConnection() {
    try {
      this.connection = DriverManager.getConnection(url, username, password);
    } catch (Exception ex) {
      System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
    }
  }
  public Connection getConnection() {
    return connection;
  }
  public static synchronized DatabaseConnection getInstance() throws SQLException {
    if (DB_INSTANCE == null) {
      DB_INSTANCE = new DatabaseConnection();
    } else if (DB_INSTANCE.getConnection().isClosed()) {
      DB_INSTANCE = new DatabaseConnection();
    }
    return DB_INSTANCE;
  }
}
  
