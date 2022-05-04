package com.revature.pixott.handler;



import com.revature.app.App;

public class AdminLogin {
	public static void display() {
		System.out.println("_________________________________________________");
		System.out.printf("%30s \n","Menu");
		System.out.println("_________________________________________________");
		System.out.println("[1] Change Top 5 Movies");
		System.out.println("[2] Mark Movie unavailable");
		System.out.println("[3] Update Movie details");
		System.out.println("[4] Get back to MainMenu");
		System.out.println("Select an option:");
		int option = App.scanner.nextInt();
		if(option==1) {
			ChangeTop5.display();
		}
		else if(option==2) {
			AdminMarkUnavailable.display();
		}
		else if(option==3) {
			AdminUpdateMovie.display();
		}
		else if (option==4) {
			Mainmenu.display();
		}
	}
}
