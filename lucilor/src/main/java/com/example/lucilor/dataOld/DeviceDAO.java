package com.example.lucilor.dataOld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.lucilor.beans.Device;

public class DeviceDAO {
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

    public Device addDevice(Device device) {
        Device result = device;

        try (Connection conn = DriverManager.getConnection(connString, username, password)) {
            String sql = "INSERT INTO device (phoneNumber, phoneModel, phoneNickname) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, device.getPhoneNumber());
            stmt.setString(2, device.getPhoneModel());
            stmt.setString(3, device.getPhoneNickname());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }
}
