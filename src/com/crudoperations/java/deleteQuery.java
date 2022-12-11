package com.crudoperations.java;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteQuery
{
    private static java.sql.Connection conn;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement stmt= null;
        String employeeId="10";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn =  DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/example", "root", "root");
        stmt= conn.createStatement();
        String delete_Query = "Delete from employee_details where emp_id = '"+employeeId+"'";
        int a = stmt.executeUpdate(delete_Query);
        {
            if (a > 0)
                System.out.println("One User Successfully Deleted");
            else
                System.out.println("ERROR OCCURRED :(");

            conn.close();
        }
    }
}
