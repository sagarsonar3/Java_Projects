package com.crudoperations.java;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertClass
{
    private static java.sql.Connection conn;
    public static void main(String args[]) throws SQLException {

        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/example", "root", "root");
          //  System.out.println("connected");
            stmt=conn.createStatement();
            String q1 = "INSERT INTO EMPLOYEE_DETAILS VALUES" +
                    "(10, 'Bunty', 0.6, '2022-09-09 16:20:32','29','abc','jihui','ijijguy')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)
                System.out.println("Successfully Inserted");
            else
                System.out.println("Insert Failed");

            conn.close();
        } catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
             // Inserting data in database



        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
