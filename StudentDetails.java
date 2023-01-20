/* Program to read roll no, name and marks of three subjects and calculate the total, percentage and division?
Test Data:
Roll Number :51
Name of Student :James
Marks of Physics, Chemistry and Computer Application :70 80 90 Expected Output :
Roll No : 51
Name of Student: James Marks in Physics : 70 Marks in Chemistry : 80
Marks in Computer Application : 90Total Marks = 240
Percentage = 80 Division = First */


import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rollno, phy, che, computer, totmark;
		float per;
		// float percentage;
		String name, division ;
		System.out.println("the roll number of the student:\n");
		rollno=scanner.nextInt();
		System.out.println(" the Name of the Student:\n");
		name=scanner.next();
		System.out.println(" marks in physics\n");
		phy = scanner.nextInt();
		System.out.println(" marks in chemistry\n");
		che = scanner.nextInt();
		System.out.println(" marks in computer \n");
		computer = scanner.nextInt();
		totmark = phy + che + computer;
		System.out.println(" toatl marks\n" + totmark);
		per = totmark / 3 * 100;
		// percentage = per * 100;
		System.out.println(" the percentage is\n" + per);
		System.out.println(" division=");
		division=scanner.next();
		
	}
}
