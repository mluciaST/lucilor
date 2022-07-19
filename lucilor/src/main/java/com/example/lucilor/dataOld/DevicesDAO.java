package com.example.lucilor.dataOld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.lucilor.beans.Devices;

public class DevicesDAO {
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

    public Devices addDevices(Devices devices) {
        Devices result = devices;

        try (Connection conn = DriverManager.getConnection(connString, username, password)) {
            String sql = "INSERT INTO device (accountNumber, devicesID, phoneNumber) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, devices.getAccountNumber());
            stmt.setInt(2, devices.getDevicesID());
            stmt.setInt(3, devices.getPhoneNumber());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }

}
