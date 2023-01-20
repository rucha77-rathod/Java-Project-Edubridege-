//Create a java program to print your father, mother name, age, salary, phone number,address like city, state?

import java.util.Scanner;
public class Intro {


	public static void main(String[] args) {

		String mother, father, city;
		int age;
		float salary;
		
		Scanner info = new Scanner(System.in);

		System.out.println("Mother  Name:  ");
		mother = info.nextLine();
		
		System.out.println("Father  Name:  ");
		father = info.nextLine();
		
		System.out.println("Age:  ");
		age= info.nextInt();
		
		System.out.println("Salary:  ");
		salary= info.nextFloat();
		
        System.out.println("City:  ");
		city =info.next();
	
	}

}
