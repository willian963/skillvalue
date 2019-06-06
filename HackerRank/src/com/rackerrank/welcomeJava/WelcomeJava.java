package com.rackerrank.welcomeJava;

import java.util.Scanner;

public class WelcomeJava {
	public static void main(String[] args) {
		System.out.println("Hello, World.\r\n" + 
				"Hello, Java.");
		
		 System.out.print("Please enter your full name: ");
		 Scanner scanner = new Scanner(System.in);
	        //scanner.nextLine();
	        String name = scanner.nextLine();
	        System.out.print(name);
	}
}
