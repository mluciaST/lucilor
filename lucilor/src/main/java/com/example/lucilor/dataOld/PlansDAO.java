package com.example.lucilor.dataOld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.lucilor.beans.Plans;

public class PlansDAO {
    static final String connString = "jdbc:mysql://localhost:3306/project2";
    static final String username = "root";
    static final String password = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Plans addPlans(Plans plans) {
        Plans result = plans;

        try (Connection conn = DriverManager.getConnection(connString, username, password)) {
            String sql = "INSERT INTO plans (cloudStorage, description, devices, mobileHotspotData, networkAccess, plantCost, planName, planNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, plans.getCloudStorage());
            stmt.setString(2, plans.getDescription());
            stmt.setInt(3, plans.getDevices());
            stmt.setInt(4, plans.getMobileHotspotData());
            stmt.setInt(5, plans.getNetworkAccess());
            stmt.setDouble(6, plans.getPlanCost());
            stmt.setString(7, plans.getPlanName());
            stmt.setInt(8, plans.getPlanNumber());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

}
