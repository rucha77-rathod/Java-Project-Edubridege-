//Write a program to find the factorial value of any number entered through the keyboard.

public class Factorial_A4 {
	public static void main(String args[]) {
		int i, fact = 1;
		int number = 3;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of given number is:" + fact);
	}
}