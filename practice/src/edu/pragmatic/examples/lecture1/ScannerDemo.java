package edu.pragmatic.examples.lecture1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		System.out.println("Your age is:" + age);
		
		System.out.println("Enter your height:");
		double height = scanner.nextDouble();
		System.out.println("Your height is " + height);
		
		boolean isMonday = scanner.nextBoolean();
		
	}

}
