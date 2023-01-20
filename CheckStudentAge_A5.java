//Write a program to check age of student is greater than 18 ?


import java.util.Scanner;

public class CheckStudentAge_A5 {
	public static void main(String[] args) {
		int age;
		boolean result;
		Scanner a = new Scanner(System.in);
		System.out.println(" Enter the age of student");
		age = a.nextInt();
		result = age > 18;
		System.out.println(" Student's age is more than 18\n" + result);

	}
}
