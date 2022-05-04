package com.revature.fsd.pixott.model;

public class Top5 {
     int id;
     int movie_id;
     String name;
     public Top5() {
    	 
     }
	public Top5(int id, int movie_id, String name) {
		super();
		this.id = id;
		this.movie_id = movie_id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + movie_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Top5 other = (Top5) obj;
		if (id != other.id)
			return false;
		if (movie_id != other.movie_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("ID=%d %-40s", movie_id,name);
	}
     
}
