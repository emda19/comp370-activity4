package comp370.emailChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the email checker!\nPlease enter an email String: ");
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		
		if (EmailChecker.EmailChecker1(userInput) == true) {
			System.out.println("This is a valid email address");
		} else {
			System.out.println("This is an invalid email address");
		}
		
		keyboard.close();
	}
}
