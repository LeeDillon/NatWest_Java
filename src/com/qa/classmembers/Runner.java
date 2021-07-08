package com.qa.classmembers;

public class Runner {

	static double Physics = 100;
	static double Chemistry = 120;
	static double Biology = 85;
	static double Total  = Physics + Chemistry + Biology;
	static double Percentage = (Total*100)/450;
	
	public static void main(String[] args) {
		findTotal();
		findPercentage();
	}
	
	public static void findTotal() {
		System.out.println("Your Total Score across all subjects is " +Total+" points");
		
		
	}
	public static void findPercentage() {
		System.out.print("Your Total Score as a percentage is " + Percentage + "%");
		if(Percentage < 60) {
			System.out.print(" you have failed your exams and are a terrible human being.");
		}
	
	}
}
