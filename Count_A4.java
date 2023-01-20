//Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered.


import java.util.Scanner;

public class Count_A4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, countPositive = 0, countNegative = 0, countZero = 0;
		char ch;
		do {
			System.out.print("Enter the number ");
			number = scanner.nextInt();
			if (number > 0) {
				countPositive++;
			} else if (number < 0) {
				countNegative++;
			} else {
				countZero++;
			}
			System.out.print("Do you want to continue y/n? ");
			ch = scanner.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Positive numbers: " + countPositive);
		System.out.println("Negative numbers: " + countNegative);
		System.out.println("Zero numbers: " + countZero);
	}
}