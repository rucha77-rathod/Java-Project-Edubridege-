//Write a program that prompts the user to input a positive integer. It should then
//output a message indicating whether the number is a prime number.

import java.util.Scanner;

public class Prime_num_A4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		scanner.close();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
			} else {
			}
			System.out.println("number is prime:" + num);
			System.out.println("number is not prime:" + num);
		}
	}
}