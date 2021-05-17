package Entities;

import java.time.LocalDateTime;

import Abstract.Entity;

class Customer implements Entity{
	public int Id;
	public String firstName;
	public String lastName;
	public LocalDateTime dateOfBirth;
	public String nationalityId;
	
}