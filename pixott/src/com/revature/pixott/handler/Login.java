package com.revature.pixott.handler;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.UserDao;
import com.revature.fsd.pixott.model.User;


public class Login {
	public static int usernameid;
 public static void display() {
	 // System.out.println("Name:");
	 App.scanner.nextLine();
	  System.out.println("_________________________________________________");
	  System.out.println("Enter the following details to login:");
	  System.out.println("Mobile Number:");
	  String u_name=App.scanner.nextLine();
	  System.out.println("Password:");
	  
	  String password=App.scanner.nextLine();
	  
	  String adminpass = "access";
	  //System.out.println("welcome Admin");
	  UserDao dao=new UserDao();
	   User user=  dao.getuser(u_name);
	   System.out.println("welcome Admin");
	   if(u_name=="01"&& password.equals(adminpass)) {
			System.out.println("welcome Admin");
			//System.out.println("_________________________________________________");
			AdminLogin.display();
			
			
		}
	   else if(user.getPassword().equals(password)) {
		   System.out.println("Login Successful....");
		   System.out.println("welcome Back ");
		   UserLogin.display();
		   System.out.println("_________________________________________________");
	   }
	   else {
		   System.out.println("Incorrect mobile or password");
		   System.out.println("_________________________________________________");
	   }
	   
	   Mainmenu.display();
 }
}
