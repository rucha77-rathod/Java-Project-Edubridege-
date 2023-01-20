//Write a program to do addition 5 number

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0, d = 0, e = 0, sum;
		

		Scanner var = new Scanner(System.in);

		System.out.println("Enter 1st no:  ");
		a = var.nextInt();

		System.out.println("Enter 2nd no:  ");
		b = var.nextInt();

		System.out.println("Enter 3rd no:  ");
		c = var.nextInt();

		System.out.println("Enter 4th no:  ");
		d = var.nextInt();

		System.out.println("Enter 5th no:  ");
		e = var.nextInt();
		
		sum = a + b + c + d + e;
		System.out.println("Sum  of  these  Numbers: " +sum);

	}
}