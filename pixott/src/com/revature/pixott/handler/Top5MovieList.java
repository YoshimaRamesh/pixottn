package com.revature.pixott.handler;

import java.util.List;
import com.revature.app.App;
import com.revature.fsd.pixott.dao.HistroyDao;
import com.revature.fsd.pixott.dao.MovieDao;
import com.revature.fsd.pixott.dao.Top5MoviesDao;
import com.revature.fsd.pixott.dao.WishListDao;
import com.revature.fsd.pixott.model.Movie;



public class Top5MovieList {
    public static void display() {
    	Top5MoviesDao dao = new Top5MoviesDao();
		List<Movie> movies = dao.top5movie();
		System.out.println("===========================");
		System.out.printf("%20s \n","Top 5 Movies");
		System.out.println("===========================");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		movies.forEach(System.out::println);
		System.out.println("Select a movie (Enter Id):");
		int id = App.scanner.nextInt();
		System.out.println("===========================");
		System.out.println("[1]Add to Wishlist");
		System.out.println("[2]Play Now");
		System.out.println("[3]Skip for now");
		System.out.println("Select an option:");
		int act=App.scanner.nextInt();
		int unique =Login.usernameid;

		if (act==1) {
			WishListDao add= new WishListDao();
			List<Movie> wish= add.inserttowishlist(id,unique);
					System.out.println("Added to Wishlist");
			UserLogin.display();
		}
		else if(act==2){
			HistroyDao addhistory=new HistroyDao();
			List<Movie> watched=addhistory.history(id,unique);
			System.out.println("Playing Now");
			UserLogin.display();
		}
		else if(act==3){
			UserLogin.display();
		}
		else {
			System.out.println("Invalid option");
			Top5MovieList.display();
		}
    }
}
