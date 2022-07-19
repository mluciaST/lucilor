package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Plans;

@Component
public class PlansRowMapper implements RowMapper<Plans> {

    @Override
    public Plans mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Plans(rs.getInt("cloudStorage"),
                rs.getString("description"),
                rs.getInt("devices"),
                rs.getInt("mobileHotspotData"),
                rs.getInt("networkAccess"),
                rs.getDouble("planCost"),
                rs.getString("planName"),
                rs.getInt("planNumber"));
    }
}
