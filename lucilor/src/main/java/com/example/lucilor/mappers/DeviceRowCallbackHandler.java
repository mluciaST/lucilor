package com.example.lucilor.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import com.example.lucilor.beans.Device;

@Component
@Scope("prototype")
public class DeviceRowCallbackHandler implements RowCallbackHandler {

    @Override
	public void processRow(ResultSet rs) throws SQLException {
		//do some processing/ inspection of the rows
		Device temp = new Device(rs.getInt("phoneNumber"), 
						       rs.getString("phoneModel"), 
							   rs.getString("phoneNickname"));
		
		}

	}
}
