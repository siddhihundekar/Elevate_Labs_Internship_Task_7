package task_7;

//public class Employee {

import java.sql.*;
import java.util.*;

public class EmployeeDAO {

    // ADD EMPLOYEE
    public void addEmployee(String name, int age, double salary) {
        String query = "INSERT INTO employees(name, age, salary) VALUES(?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setDouble(3, salary);

            pst.executeUpdate();
            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW EMPLOYEES
    public void viewEmployees() {
        String query = "SELECT * FROM employees";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\n----- EMPLOYEE LIST -----");

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Salary: " + rs.getDouble("salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE EMPLOYEE
    public void updateEmployee(int id, String name, int age, double salary) {
        String query = "UPDATE employees SET name=?, age=?, salary=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setDouble(3, salary);
            pst.setInt(4, id);

            int rows = pst.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Updated Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE EMPLOYEE
    public void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, id);

            int rows = pst.executeUpdate();

            if (rows > 0)
                System.out.println("Employee Deleted Successfully!");
            else
                System.out.println("Employee Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

