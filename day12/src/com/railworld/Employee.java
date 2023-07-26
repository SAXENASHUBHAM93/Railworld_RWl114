package com.railworld;

import java.sql.Date;

public class Employee {
	
    private int id;
	private String name;
	private int salary ;
	private Date date;
	
	
	public Employee() {
		
		
		
	}


	public Employee(int id, Date date, String name, int salary) {
	
		this.id = id;
		this.date = date;
		this.name = name;
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", date=" + date + ", name=" + name + ", salary=" + salary + "]";
	}


	
	

}
