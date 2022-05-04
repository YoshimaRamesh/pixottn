package com.revature.fsd.pixott.model;

public class Movie {
 private int id;
 private String name;
 private double sales;
 private int year;
 public Movie() {
	 
 }
public Movie(int id, String name, double sales, int year) {
	super();
	this.id = id;
	this.name = name;
	this.sales = sales;
	this.year = year;
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
public double getSales() {
	return sales;
}
public void setSales(double sales) {
	this.sales = sales;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(sales);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + year;
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
	Movie other = (Movie) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(sales) != Double.doubleToLongBits(other.sales))
		return false;
	if (year != other.year)
		return false;
	return true;
}
@Override
public String toString() {
	return  String.format("%4s %-40s\n", id,name);
}
 
}
