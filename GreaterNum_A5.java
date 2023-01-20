//write a program to check whether number is greater than 100 and 200.


import java.util.Scanner;

public class GreaterNum_A5 {
	public static void main(String[] args) {
		int number;
		String result;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		number = scan.nextInt();
		result = ((number > 100) && (number > 200)) ? " the number is greater than 100 and 200"
				: " the number is not greater than 100 and 200";
		System.out.println(result);
	}
}
