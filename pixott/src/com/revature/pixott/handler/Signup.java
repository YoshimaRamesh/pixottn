package com.revature.pixott.handler;

import com.revature.app.App;
import com.revature.fsd.pixott.dao.UserDao;
import com.revature.fsd.pixott.model.User;

public class Signup {
  public static void display() {
	  System.out.println("_________________________________________________");
	  System.out.println("Thank you for choosing Pixott");
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	  System.out.println("Enter the following details to create account");
	  System.out.println("_________________________________________________");
	  System.out.println("Name:");
	  String name=App.scanner.next();
	  System.out.println("Moblie Number:");
	  String mobile_no=App.scanner.next();
	  System.out.println("Password:");
	  String password=App.scanner.next();
	  System.out.println("_________________________________________________");
	  UserDao dao=new UserDao();
	   User user=new User();
	   user.setName(name);
	   user.setMobile_no(mobile_no);
	   user.setPassword(password);
	   dao.signup(user);
	   System.out.println("Your account has been created successfully.");
	   System.out.println("Login and Enjoy:)");
	   System.out.println("_________________________________________________");
	   Mainmenu.display();
	   
  }
}
