package com.revature.pixott.handler;
import java.util.List;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.AdminMarkUnavailableDao;
import com.revature.fsd.pixott.dao.SearchMovieDao;
import com.revature.fsd.pixott.model.Movie;
public class AdminMarkUnavailable {
public static void display() {
	System.out.println("_________________________________________________");
	System.out.println("Enter the movie name to be removed from the list:");
	System.out.println("_________________________________________________");
	String key=App.scanner.next();
	SearchMovieDao searchmovie =new SearchMovieDao();
	List<Movie> foundmovie=searchmovie.search(key);
	System.out.printf("Search results %s  ",key);
	System.out.println("_________________________________________________");
    foundmovie.forEach(System.out::println);
    System.out.println("_________________________________________________");
    System.out.println("Enter movie ID  to be removed from the list");
    System.out.println("_________________________________________________");
    int removeid=App.scanner.nextInt();
    AdminMarkUnavailableDao delete= new AdminMarkUnavailableDao();
    List<Movie> delete_movie = delete.delete(removeid);
    System.out.println("Movie removed successfully");
    System.out.println("_________________________________________________");
    AdminLogin.display();
}

}
