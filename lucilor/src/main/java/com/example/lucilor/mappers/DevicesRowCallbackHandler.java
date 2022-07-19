package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Devices;

@Component
@Scope("prototype")
public class DevicesRowCallbackHandler implements RowCallbackHandler {

    @Override
    public void processRow(ResultSet rs) throws SQLException {
        Devices temp = new Devices(rs.getInt("accountNumber"),
                rs.getInt("devicesID"),
                rs.getInt("phoneNumber"));

    }

}
