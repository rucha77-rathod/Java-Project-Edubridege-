//write a program to check whether both numbers are same or not.

import java.util.Scanner;

public class SameNum_A5 {

	public static void main(String[] args) {
		int number1;
		int number2;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number 1");
		number1 = scan.nextInt();
		System.out.println(" Enter the number 2");
		number2 = scan.nextInt();
		result = (number1 == number2) ? " both numbers are same" : " both numbers are not same";
		System.out.println(result);
	}
}
