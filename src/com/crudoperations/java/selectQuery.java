package com.crudoperations.java;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectQuery
{
    private static java.sql.Connection conn;
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root", "root");
        stmt = conn.createStatement();

        String selectQuery = "Select * from EMPLOYEE_DETAILS";
        ResultSet rs = stmt.executeQuery(selectQuery);
        if(rs.next())
        {
            System.out.println("EMP ID : "+rs.getString(1));
            System.out.println("EMP NAME : "+rs.getString(2));
            System.out.println("AGE : "+rs.getString(5));
        }
        else
        {
            System.out.println("No such user id is already registered");
        }
        conn.close();

    }

}
