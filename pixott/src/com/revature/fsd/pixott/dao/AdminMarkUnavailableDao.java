package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Movie;


public class AdminMarkUnavailableDao {
	public List<Movie> delete(int id){
		List<Movie> delete_movie = new ArrayList<>();
		String sql = "delete from movie where id=?;";
		try(Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			stmt.setInt(1,id);
			stmt.executeUpdate();
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
		return delete_movie;
	}
}
