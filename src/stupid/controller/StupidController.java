package stupid.controller;

import java.util.Scanner;

/**
 * 
 * @author Derek Vawdrey
 *
 */

public class StupidController
{
	public void start()
	{
		System.out.println("I am Derek.");
		testScanner();
	}
	
	private void testScanner() {
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String response = firstScanner.nextLine();
		System.out.println("You like " + response + "?");
		
	}
	
}
