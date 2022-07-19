package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.AccountInformation;

@Component
public class AccountInformationRowMapper implements RowMapper<AccountInformation> {

    @Override
    public AccountInformation mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new AccountInformation(rs.getInt("accountNumber"),
                rs.getString("addressLine1"),
                rs.getString("addressLine2"),
                rs.getString("city"),
                rs.getInt("dateOfBirth"),
                rs.getString("email"),
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getInt("phoneNumber"),
                rs.getInt("plans"),
                rs.getString("state"),
                rs.getInt("zip"));
    }

}
