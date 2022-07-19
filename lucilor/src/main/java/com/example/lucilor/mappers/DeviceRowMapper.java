package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Device;

@Component
public class DeviceRowMapper implements RowMapper<Device> {

    @Override
    public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Device(rs.getInt("phoneNumber"),
                rs.getString("phoneModel"),
                rs.getInt("phoneNickname"));
    }
}
