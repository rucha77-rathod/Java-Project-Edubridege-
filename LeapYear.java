//Write program to find whether a given year is a leap year or not

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year in Number:");
		Scanner yearNum = new Scanner(System.in);
		int year = yearNum.nextInt();
		if ((year % 100 != 0) && year % 4 == 0 || year % 400 == 0) {
			System.out.println("Given year is Leap Year:" + year);
		} else {
			System.out.println("Given year Not a Leap Year:" + year);
		}
	}
}
