//Write a program that prompts the user to input a positive integer. It should then print
//the multiplication table of that number.

import java.util.Scanner;

public class Table_A4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the positive number");
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println("n*i");
		}
	}
}