package com.userregistrationproblem;

import java.util.Scanner;

public class UserRegistrationProblem {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ChooseOption();
	}
	public static void ChooseOption() {
		System.out.println("1.FirstName");
		
		System.out.println("Enter No. To check");
		int inputOption = scan.nextInt();
		
		switch(inputOption) {
		case 1 : 
			System.out.println("Enter first name:");
			String firstName = scan.next();
			firstNameChecking(firstName);
			break;
		default:
			System.out.println("Enter Valid Option");
		}
	}
	public static void firstNameChecking(String firstName) {
		boolean valid = firstName.matches("^[A-Z]{1}[a-z]{2,}$");
		System.out.println("Name: " + firstName + "\nValid: " + valid);
	}
}
