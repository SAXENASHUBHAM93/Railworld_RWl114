package com.railworld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner (System.in); 
		
		
		ArrayList<Person> person = new ArrayList<>();
		
		
		
		
		
		
		//useing for for loop
		
		
		
		for (int i = 0; i<5; i++) {
			
			String name = s.next();
			int age = s.nextInt();
			String gender = s.next(); 
			String address = s.next();
			person.add(new Person(name, age, gender, address));
		}
		
	
		
		
		
		
       //using for loop
		
		for(int i = 0; i<person.size();i++) {
			
			System.out.println(person.get(i));
			
		}
		
		
		//Useing enhance for loop
		
		for(Person person1: person) {
			
			System.out.println(person1);
			
			
		}
		
		//useing iterator method
		
		
		
	
	Iterator it = person.iterator();
	 System.out.println(it.next());
	 
	//useing for while
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}

}
