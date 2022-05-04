package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Movie;


public class HistroyDao {
	public List<Movie> history(int id,int unique){
		String sql="insert into history (history,user_id) values (?,?);";
		List<Movie> his = new ArrayList<>();
		try(Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			stmt.setInt(1,id);
			stmt.setInt(2, unique);
			stmt.executeUpdate();
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
		return his;
	}
}
