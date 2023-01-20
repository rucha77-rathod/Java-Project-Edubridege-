//Write a program that reads a set of integers, and then prints the sum of the even an odd integers.

import java.util.Scanner;

public class Sum_Even_Odd_A4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the interger number");
		int i = 0;
		int num = 0;
		int sumeven = 0;
		int sumodd = 0;
		num = scanner.nextInt();
		scanner.close();
		for (i = num; i != 0; i = i) {
			if (i % 2 == 0) {
				sumeven = sumeven + i;
			} else {
				sumodd = sumodd + i;
				i = scanner.nextInt();
			}
			System.out.println("sum of even number:" + sumeven);
			System.out.println("sum of odd number:" + sumodd);
		}
	}
}