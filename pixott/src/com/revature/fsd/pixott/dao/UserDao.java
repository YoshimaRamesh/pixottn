package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.fsd.pixott.model.User;

public class UserDao {
  public void signup(User user){
	 // System.out.println("test");
	  String sql="insert into pixott.user(Name,Mobile_no,Password) values(?,?,?)";
	  try(
	   Connection conn=Util.getConnection();
		PreparedStatement stmt=conn.prepareStatement(sql);
			  ){
		 // System.out.println("connected successfully.");
		  stmt.setString(1, user.getName());
		  stmt.setString(2, user.getMobile_no());
	      stmt.setString(3, user.getPassword());
		  stmt.execute();

	  }catch(SQLException e) {
		  System.out.println(e.getMessage());
	  }
  }
	  
  public User getuser(String u_name){
	  String sql="select * from user where Mobile_No= (?)";
	  try(
	   Connection conn=Util.getConnection();
		PreparedStatement stmt=conn.prepareStatement(sql);
			  ){
		 // System.out.println("connected successfully.");
		 //stmt.setString(1, user.getName());
		  stmt.setString(1, u_name);
		  ResultSet rs=stmt.executeQuery();
          if(rs.next()) {
        	  User user=new User();
        	  user.setId(rs.getInt("id"));
        	  user.setName(rs.getString("name"));
       	      user.setMobile_no(rs.getString("mobile_no"));
       	      user.setPassword(rs.getString("password"));
       	      return user;
          }
          else{
        	  System.out.println("Invalid login ");
          }
	  }catch(SQLException e) {
		  System.out.println(e.getMessage());
	  }
	return null;
	  }
   /*public static void main(String args[]) {
	   UserDao dao=new UserDao();
	   User user=new User();
	   user.setName(name);
	   user.setMobile_no(mobile);
	   user.setPassword(password);
	   dao.signup(user);
   }*/
   
  
}