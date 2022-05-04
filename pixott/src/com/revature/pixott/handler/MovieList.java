package com.revature.pixott.handler;

import java.util.List;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.HistroyDao;
import com.revature.fsd.pixott.dao.MovieDao;
import com.revature.fsd.pixott.dao.WishListDao;
import com.revature.fsd.pixott.model.Movie;

public class MovieList {
	  public static void display() {
	    	MovieDao dao = new MovieDao();
			List<Movie> movies = dao.getmovie();
			System.out.println("===========================");
			System.out.printf("%20s \n","Movies");
			System.out.println("===========================");
			System.out.println();
			System.out.printf("%4s %-40s\n", "Id", "Name");
			System.out.printf("%4s %-40s\n", "==", "====");
			movies.forEach(System.out::println);
			System.out.println("===========================");
			System.out.println("Enter movie id to select a movie:");
			int id=App.scanner.nextInt();
			System.out.println("[1]Add to Wishlist");
			System.out.println("[2]Play Now");
			System.out.println("[3]Skip for now");
			System.out.println("Select an option:");
			int act=App.scanner.nextInt();
			int unique=Login.usernameid;
			if (act==1) {
				WishListDao wish = new WishListDao();
				List<Movie> wishlist= wish.inserttowishlist(id,unique);
				System.out.println("Added to Wishlist");
				UserLogin.display();
			}
			else if(act==2){
				
				HistroyDao addhistory=new HistroyDao();
				List<Movie> watched=addhistory.history(id,unique);
				System.out.println("Playing Now");
				UserLogin.display();
			}
			else if(act==3) {
				UserLogin.display();
			}
			else {
				System.out.println("Invalid option");
				MovieList.display();
			}
	    }
}
