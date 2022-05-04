package com.revature.pixott.handler;

import java.util.List;


import com.revature.app.App;
import com.revature.fsd.pixott.dao.HistroyDao;
import com.revature.fsd.pixott.dao.WishListDao;
import com.revature.fsd.pixott.model.Movie;

public class UserWishList {
 public static void display() {
	int unique = Login.usernameid;
	System.out.println("______________"); 
	System.out.println("Your Wishlist");
	System.out.println("______________");
	WishListDao wish= new WishListDao();
	List<Movie> view_wish = wish.view(unique);
	view_wish.forEach(System.out::println);
	System.out.println("Select an movie id to play");
	int id= App.scanner.nextInt();
	System.out.println("Grab your popcorn and Enjoy");
	System.out.println("Playing Now");
	HistroyDao addhistory=new HistroyDao();
	List<Movie> watched=addhistory.history(id,unique);
	System.out.println("Thanks for Watching......");
	UserLogin.display();
}
}