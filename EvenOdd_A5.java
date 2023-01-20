//Write a program to check number is even or odd

import java.util.Scanner;

public class EvenOdd_A5 {

	public static void main(String[] args) {
		int number;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number");
		number = scan.nextInt();
		result = (number % 2 == 0) ? " It is a even number" : " It is a odd number";
		System.out.println(result);
	}
}
