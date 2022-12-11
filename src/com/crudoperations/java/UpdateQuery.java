package com.crudoperations.java;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery
{
    private static java.sql.Connection conn;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement st = null;
        String emp_name="Sagar";
        String id="1";
        String New_emp_name="Bunty";
        String New_Age="29";

        Class.forName("com.mysql.cj.jdbc.Driver");
        conn =  DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/example", "root", "root");

        st = conn.createStatement();
        String updateQuery =  "UPDATE employee_details set EMP_NAME = '" + New_emp_name +
                "' WHERE EMP_ID = '" +id+ "' AND EMP_NAME = '" + emp_name + "'";
        System.out.println("updateQuery-->"+updateQuery);
        int x= st.executeUpdate(updateQuery);
        if(x>0) {
            System.out.println("Details Successfully Updated");
        }
            else {
            System.out.println("ERROR OCCURRED in Update ");
        }
            conn.close();


    }
}
