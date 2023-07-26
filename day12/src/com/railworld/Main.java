package com.railworld;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter name");
		 String name=sc.next();
		 
		 System.out.println(" Enter id");
		 int id=sc.nextInt();
		 


		 System.out.println(" Enter salary");
		 int salary=sc.nextInt();


		 System.out.println(" Enter id");
		 String date = sc.next();
		 
		 
		 LocalDate lDate =  LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
         
         Date date1 =   Date.valueOf(lDate);
       		  
       	 Employee p = new Employee(name, date1);
       		  
       		  
       		  System.out.println(p);

	}

}
