package input.controller;

import java.util.Scanner;
//you need the scanner if you have private Scanner

public class InputController
{
	//Declaration section for instance variables
	//Data members are always private
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		question();
	}
	private void question()
	{
		System.out.println("Please type your name");
		String myInput;
		// the String myInput; can only be in between the 2 {}
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello "+ myInput +", do you like watermelon?");
		System.out.println("watermelon is good? please type it!");
		String fullname = inputScanner.nextLine();
		System.out.println("your full name is:"+ fullname);
		System.out.println("my name is guavo.");
		System.out.println("whats thine age?");
		int age = inputScanner.nextInt();
		System.out.println("You are "+ age + "years old? dang");
		System.out.println("so your "+ fullname + + age + " years young.");
	}
} 
