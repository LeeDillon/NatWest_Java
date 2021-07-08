package com.qa.loops;

public class Runner {

	public static void main(String[] args) {
		// for loop
		// for(<some variable>;<some condition>; <incrementer>){
		// Body/ LOGIC
		// }

		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
//1a.		first time it runs set count to 1;
//2.		next it check if count is less than or equal to 5
//3.		Then if it is it prints the line 
//4.		And then AFTER increments the value

		// While(condition){
		// keep doing it
		// }
		//
//		System.out.println("IT continue to run outSIDEEEEEE");
//		boolean homeTime = false;
//		int time = 2; // 5pm
//
//		while (!homeTime) {  
//
//			// its setting homeTime to true;
//			if (time >= 5) {
//				homeTime = true;
//			}
//			System.out.println("Keep working " + time);
//			
//			// increments
//			time++;
//
//		}
//		while loop check the condition first and only then will run

		// Do While loop WILL RUN ONCE ALWAYS
//		do{
//			L O G I C //E
//		}while(some condition is true)
//		

		boolean myBool = true;

		do {
			System.out.println("DO WHILE: Dont end the world!");
			myBool = false;
		} while (myBool);

		myBool = true;
		while (myBool) {
			System.out.println("WHILE: Dont end the world!");
			myBool = false;
		}

	}

}
