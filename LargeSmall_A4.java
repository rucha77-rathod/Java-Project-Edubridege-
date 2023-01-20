//2 Write a program to enter the numbers till the user wants and at the end the program
//should display the largest and smallest numbers entered.

import java.util.Scanner;

public class LargeSmall_A4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		char ch;
		do {
			System.out.print("Enter the number ");
			number = scanner.nextInt();
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
			System.out.print("Do you want to continue y/n? ");
			ch = scanner.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Largest number: " + max);
		System.out.println("Smallest number: " + min);
	}
}