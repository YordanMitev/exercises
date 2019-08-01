package edu.pragmatic.examples.basicsyntax;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		String userInput = scanner.nextLine();
		System.out.println("You've entered : " + userInput);
		
		System.out.println("End of program!");
	}

}
