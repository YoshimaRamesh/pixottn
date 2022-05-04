package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Movie;

public class MovieDao {
	 public List<Movie> getmovie()
     {
	   String sql="select * from movie ";
	   List<Movie> movies=new ArrayList<>();
	   try(
			   Connection conn=Util.getConnection();
				PreparedStatement stmt=conn.prepareStatement(sql);
					  ){
				 ResultSet rs=stmt.executeQuery();
                 while(rs.next()) {
                	 Movie movie=new Movie();
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
