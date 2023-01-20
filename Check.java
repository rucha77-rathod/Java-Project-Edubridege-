//Program to check whether the character is alphabet, digit or special character.

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the any character:");

		char ch = scan.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + "is alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "is number");
		} else {
			System.out.println(ch + "is Spacial character:");
		}
	}
}
