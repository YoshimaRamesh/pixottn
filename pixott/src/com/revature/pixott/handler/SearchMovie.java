package com.revature.pixott.handler;

import java.util.List;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.HistroyDao;
import com.revature.fsd.pixott.dao.SearchMovieDao;
import com.revature.fsd.pixott.dao.WishListDao;
import com.revature.fsd.pixott.model.Movie;

public class SearchMovie {
 public static void display() {
	 App.scanner.nextLine();
	    System.out.println("_________________________________________________");
	    System.out.println("Search Movie");
		
		System.out.println("enter the movie name to watch");
		System.out.println("_________________________________________________");
		String search_movie= App.scanner.nextLine();
		System.out.println("_________________________________________________");
		SearchMovieDao movie = new SearchMovieDao();
		List<Movie> find = movie.search(search_movie);
		System.out.println("search result");
		System.out.println("_________________________________________________");
		find.forEach(System.out::println);
		System.out.println("_________________________________________________");
		System.out.println("select a movie to watch (enter the id)");
		int id = App.scanner.nextInt();
		System.out.println("_________________________________________________");
		System.out.println("1] Add movie to Wish List");
		System.out.println("2] Play movie");
		System.out.println("Select an option:");
		int option = App.scanner.nextInt();
		int unique= Login.usernameid;
		if(option==1) {
			WishListDao wish = new WishListDao();
			List<Movie> wishlist= wish.inserttowishlist(id,unique);
			UserLogin.display();
		}
		else if(option ==2) {
			HistroyDao addhistory=new HistroyDao();
			List<Movie> watched=addhistory.history(id,unique);
			System.out.println("Grab your popcorn and Enjoy");
			System.out.println("Thanks for Watching......");
			UserLogin.display();
		}
		
 }
}
