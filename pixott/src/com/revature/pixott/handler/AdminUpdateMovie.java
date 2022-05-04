package com.revature.pixott.handler;

import java.util.List;


import com.revature.app.App;
import com.revature.fsd.pixott.dao.AdminUpdateMovieDao;
import com.revature.fsd.pixott.dao.SearchMovieDao;
import com.revature.fsd.pixott.model.Movie;

public class AdminUpdateMovie {
	public static void display() {
    System.out.println("_________________________________________________");	
	System.out.println("enter the movie name to modify");
	System.out.println("_________________________________________________");
	String name = App.scanner.next();
	System.out.println("_________________________________________________");
	SearchMovieDao movie = new SearchMovieDao();
	List<Movie> find = movie.search(name);
	System.out.println("search result");
	System.out.println("_________________________________________________");
	find.forEach(System.out::println);
	System.out.println("_________________________________________________");
	System.out.println("select a movie (enter the id)");
	System.out.println("_________________________________________________");
	int id = App.scanner.nextInt();
	System.out.println("_________________________________________________");
	System.out.println("enter the movie name that needs to be modified");
	System.out.println("_________________________________________________");
	String updated = App.scanner.next();
	System.out.println("_________________________________________________");
	AdminUpdateMovieDao modify = new AdminUpdateMovieDao();
	List<Movie> update= modify.modify_movie(updated,id);
	System.out.println("Updated movie details for"+updated);
}
}