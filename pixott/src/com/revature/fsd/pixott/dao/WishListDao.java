package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.fsd.pixott.model.Movie;
;

public class WishListDao {
	public List<Movie> inserttowishlist(int id, int unique){
		String sql = "insert into wishlist (wishlist,user_id) values (?,?);";
		List<Movie> list = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			           stmt.setInt(1, id);
			           stmt.setInt(2, unique);
	                 stmt.executeUpdate();
	}catch(SQLException e) {
		Util.displayMessage(e);
	}
		return list;
	}
	public List<Movie> view(int id){
		String sql= String.format("select * from wishlist inner join movie on wishlist = movie.id inner join user_details on user_id=%d where user_details.id=%d;",id,id);
		//String sql="select * from wishlist inner join movie on wishlist = movie.id inner join user_details on user_id=1 = user_details.id;";
		//String sql="select * from wishlist join movie on wishlist = movie.id;";
		List<Movie> show = new ArrayList<>();
		try(
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
				){
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
				Movie sh=new Movie();
				sh.setId(rs.getInt("id"));
				sh.setName(rs.getString("name"));
				show.add(sh);
			}
	}catch (SQLException e) {
		Util.displayMessage(e);
	}
		return show;
	}
}
