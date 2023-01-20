//Two numbers are entered through the keyboard. Write a program to find the value of
//one number raised to the power of another. (Do not use Java built-in method)

import java.util.Scanner;

public class Power_A4 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the power of that number");
		int num2 = scanner.nextInt();
		scanner.close();
		int power = 1;
		if (num2 >= 1)
			for (int i = 1; i <= num2; i++) {
				power = power * num1;
			}
		System.out.println(power);
	}
}
