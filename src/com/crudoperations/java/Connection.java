package com.crudoperations.java;

import java.sql.*;

/*




public class Connection
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing Connection
            Connection con = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "root");

            if (con != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");


        }
        catch(Exception e)
        {
            System.out.println(e);
}
*/
public class Connection {
    private static java.sql.Connection conn;

    public static void main(String args[]) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/example", "root", "root");

            if (conn != null)
                System.out.println("Connected");
            else
                System.out.println("Not Connected");

            conn.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
    /*public static Connection getConnection(){
        return conn;
    }

}*/
