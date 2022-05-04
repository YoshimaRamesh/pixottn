package com.revature.pixott.handler;

import java.util.List;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.AdminChangeTop5Dao;
import com.revature.fsd.pixott.dao.SearchMovieDao;
import com.revature.fsd.pixott.model.Movie;

public class ChangeTop5 {
	public static void display() {
		System.out.println("_________________________________________________");
		System.out.printf("%30s \n","Current top 5 movies");
		System.out.println("_________________________________________________");
		AdminChangeTop5Dao dao = new AdminChangeTop5Dao();
		List<Movie> tochangelist = dao.show();
		tochangelist.forEach(System.out::println);
		System.out.println("_________________________________________________");
		System.out.println("Enter the movie id \nwhich needs to be removed:");
		int id = App.scanner.nextInt();
		System.out.println("_________________________________________________");
		System.out.println("Enter the movie that needs to be\n updated in the top 5 movies list");
		System.out.println("_________________________________________________");
		String name = App.scanner.next();
		SearchMovieDao movie = new SearchMovieDao();
		List<Movie> find = movie.search(name);
		System.out.println("_________________________________________________");
		System.out.printf("Search result fot the movie '%s' \n",name);
		System.out.println("_________________________________________________");
		find.forEach(System.out::println);
		System.out.println("_________________________________________________");
		System.out.println("Enter the movie id that needs\n to be added in the list");
		System.out.println("_________________________________________________");
		int toinclude = App.scanner.nextInt();
		AdminChangeTop5Dao change = new AdminChangeTop5Dao();
		List<Movie> newtop5 = change.delete(toinclude,id);
		System.out.println("_________________________________________________");
		System.out.println("Top 5 Movies modified ");
		System.out.println("Updated top movie list");
		newtop5.forEach(System.out::println);
		System.out.println("_________________________________________________");
		AdminLogin.display();
	}
}
