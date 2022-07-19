package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.AccountInformation;

@Component
@Scope("prototype")
public class AccountInformationRowCallbackHandler implements RowCallbackHandler {

    @Override
    public void processRow(ResultSet rs) throws SQLException {
        AccountInformation temp = new AccountInformation(rs.getInt("accountNumber"),
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
