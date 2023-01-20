//Write a program to accept a grade and declare the equivalent description.


import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the GRADE E,V,G,A,F :");
		char ch = scan.next().charAt(0);
		switch (ch) {
		case 'E':
			System.out.println("Excellent");
			break;
		case 'V':
			System.out.println("Very good");
			break;
		case 'G':
			System.out.println("Good");
			break;
		case 'A':
			System.out.println("Average");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("invalid Grade");
		}
	}
}
