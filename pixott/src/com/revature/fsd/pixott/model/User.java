package com.revature.fsd.pixott.model;

public class User {
 private int id;
 private String name;
 private String mobile_no;
 private String password;
 public User() {
	 
 }
public User(int id, String name, String mobile_no, String password) {
	super();
	this.id = id;
	this.name = name;
	this.mobile_no = mobile_no;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile_no() {
	return mobile_no;
}
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((mobile_no == null) ? 0 : mobile_no.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (id != other.id)
		return false;
	if (mobile_no == null) {
		if (other.mobile_no != null)
			return false;
	} else if (!mobile_no.equals(other.mobile_no))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	return true;
}
@Override
public String toString() {
	return String.format("Welcome to Pixott%s", name);
}
 
}
