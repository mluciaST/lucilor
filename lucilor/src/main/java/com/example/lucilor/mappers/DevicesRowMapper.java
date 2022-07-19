package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Devices;

@Component
public class DevicesRowMapper implements RowMapper<Devices> {

    @Override
    public Devices mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Devices(rs.getInt("accountNumber"),
                rs.getInt("devicesID"),
                rs.getInt("phoneNumber"));
    }
}
