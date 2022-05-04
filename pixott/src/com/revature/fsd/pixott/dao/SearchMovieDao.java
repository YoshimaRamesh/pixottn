package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.revature.fsd.pixott.dao.Util;
import com.revature.fsd.pixott.model.Movie;

public class SearchMovieDao {
	public List<Movie> search(String search_movie){
		String symbol="%";
		String sql= String.format("select * from movie where movie_name like '%s%s%s'",symbol,search_movie,symbol);
		List<Movie> movies = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movies.add(movie);
			}
		}catch(SQLException e) {
			Util.displayMessage(e);
		}
		return movies;
	}
	
		  }


