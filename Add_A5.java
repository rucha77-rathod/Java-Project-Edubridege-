//Write your own program using arithmetic operators

import java.util.Scanner;

public class Add_A5 {

	public static void main(String[] args) {
// initializing variables
		int n1 = 0, n2 = 0, sum = 0;
		Scanner scan = new Scanner(System.in);
// Displaying num1 and num2
		System.out.println("n1 = ");
		n1 = scan.nextInt();
		System.out.println("n2 = ");
		n2 = scan.nextInt();

// adding n1 and n2 
		sum = n1 + n2;
		System.out.println("The sum = " + sum);
	}
}
