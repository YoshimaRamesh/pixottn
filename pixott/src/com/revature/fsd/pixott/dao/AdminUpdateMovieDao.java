package com.revature.fsd.pixott.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.dao.*;
import com.revature.fsd.pixott.model.Movie;
public class AdminUpdateMovieDao {
  public List<Movie> modify_movie(String name,int id){
	  List<Movie>  update= new ArrayList<>();
	  String sql = "update movie set name=(?) where id=(?)";
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
	                 stmt.setString(1,name);
	                 stmt.setInt(2, id);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
		return update;
  }
}
