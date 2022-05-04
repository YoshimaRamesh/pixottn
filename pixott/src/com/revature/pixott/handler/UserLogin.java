package com.revature.pixott.handler;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.WishListDao;


public class UserLogin {
	public static void display() {
		System.out.println("===================");
		System.out.println("[1]Top 5 Movie List ");
		System.out.println("[2]Movie List ");
		System.out.println("[3]Search Movies");
        System.out.println("[4]My Wish List");
        System.out.println("[5]Watch List");
        System.out.println("[6]Log out");
        System.out.println("===================");
		int option=App.scanner.nextInt();
		if (option==1) {
			Top5MovieList.display();
		}
		else if(option==2) {
			MovieList.display();
		}
		else if(option==3) {
			SearchMovie.display();
		}
		else if(option==4) {
			
			UserLogin.display();
		}
		
		else if(option==6) {
			 System.out.println("Logging out.......");
			 Mainmenu.display();
			 }
		}

}
