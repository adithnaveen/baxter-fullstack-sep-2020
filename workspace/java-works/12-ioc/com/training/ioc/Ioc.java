package com.training.ioc;

public class Ioc {
	public static void main(String[] args) {
		
		// @AutoWired
		MySql mysql=null; 
		User user1 = new User(mysql);
		user1.persist("Ravi");
		user1.remove(101);

		
		
		System.out.println("---------------------------------");
		// byName, byType
		User user2 = new User(new Oracle()); 
		user2.persist("Soudamini");
		user2.remove(201);
	}
}


class User {
	DataBase db ; 
	
	public User(DataBase db) {
		System.out.println("User constructed... ");
		this.db = db;  
	}
	
	public void persist(String data) {
		db.save(data);
	}
	public void remove(Integer id) {
		db.delete(id);
	}
}

interface DataBase  {
	public void save(String data); 
	public void delete(Integer id); 
}


class MySql implements DataBase{
	public void save(String data) {
		System.out.println("Saving Data [Mysql] : " + data);
	}
	public void delete(Integer id) {
		System.out.println("Deleting Data [Mysql] (ID): " + id);
	}
}

class Oracle implements DataBase{
	public void save(String data) {
		System.out.println("Saving Data [Oracle] : " + data);
	}
	public void delete(Integer id) {
		System.out.println("Deleting Data [Oracle] (ID): " + id);
	}
}





