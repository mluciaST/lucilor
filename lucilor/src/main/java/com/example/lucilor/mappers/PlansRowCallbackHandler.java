package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Plans;

@Component
@Scope("prototypw")
public class PlansRowCallbackHandler implements RowCallbackHandler {

    @Override
    public void processRow(ResultSet rs) throws SQLException {
        // do some processing/ inspection of the rows
        Plans temp = new Plans(rs.getInt("cloudStorage"),
                rs.getString("description"),
                rs.getInt("devices"),
                rs.getInt("mobileHotspotData"),
                rs.getInt("networkAccess"),
                rs.getDouble("planCost"),
                rs.getString("planName"),
                rs.getInt("planNumber"));

    }
}
