//Write a program to calculate HCF of Two given number.

import java.util.Scanner;

public class HCF_A4 {
	public static void main(String args[]) {
		int a, b, i, hcf = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number::");
		a = scanner.nextInt();
		System.out.println("Enter the second number::");
		b = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= a || i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;
			{
				System.out.println("hcf of two given number:" + hcf);
			}
		}
	}
}