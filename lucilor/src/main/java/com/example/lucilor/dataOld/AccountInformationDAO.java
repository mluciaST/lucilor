package com.example.lucilor.dataOld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.lucilor.beans.AccountInformation;

public class AccountInformationDAO {

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

    public AccountInformation addAccountInformation(AccountInformation accountInformation) {
        AccountInformation result = accountInformation;

        try (Connection conn = DriverManager.getConnection(connString, username, password)) {
            String sql = "INSERT INTO accountInformation (accountNumber, addressLine1, addressLine2, city, dateOfBirth, email, firstName, lastName, phoneNumber, plans, state, zip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, accountInformation.getAccountNumber());
            stmt.setString(2, accountInformation.getAddressLine1());
            stmt.setString(3, accountInformation.getAddressLine2());
            stmt.setString(4, accountInformation.getCity());
            stmt.setString(5, accountInformation.getDateOfBirth());
            stmt.setString(6, accountInformation.getEmail());
            stmt.setString(7, accountInformation.getFirstName());
            stmt.setString(8, accountInformation.getLastName());
            stmt.setInt(9, accountInformation.getPhoneNumber());
            stmt.setInt(10, accountInformation.getPlans());
            stmt.setString(11, accountInformation.getState());
            stmt.setInt(12, accountInformation.getZip());
            stmt.executeUpdate();

            ResultSet keys = stmt.getGeneratedKeys();
            keys.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
