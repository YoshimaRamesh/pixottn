package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.revature.fsd.pixott.dao.Util;
import com.revature.fsd.pixott.model.Movie;

public class AdminChangeTop5Dao {
	public List<Movie> show(){
		String sql= String.format("select * from top_5 join movie on top_5=movie.id;");
		List<Movie>movies = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("rid"));
				movie.setName(rs.getString("name"));
				movies.add(movie);
			}
			
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
		return movies;
	}
	public List<Movie> delete(int add, int id){
		String sql= "update top_5 set top_5 =? where id=?";
		List<Movie> movies = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
	                 stmt.setInt(1,add);
	                 stmt.setInt(2, id);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
		return movies;
	}
}
