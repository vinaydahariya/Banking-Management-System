package bank.management.system;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "");

            // Create the statement
            s = c.createStatement();

            // Check if connection was successful
            if (c != null) {
                System.out.println("Database connection established");
            }

        } catch (Exception e) {
            System.out.println("Error in connection: " + e);
        }
    }
}




