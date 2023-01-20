//write a program to display your name in short like your name, father name first letter, surname first letter.

public class ShortName {

	public static void main(String[] args) {

		String myname = "Rucha";

		String fathername = "Vinod";
		
		String surname ="Rathod";

		char fatherChar = fathername.charAt(0);

		char surChar = surname.charAt(0);

		System.out.println("My Name  Is  :  " + myname);
		System.out.println("First  Character  Of  My Father's Name  Is  :  " + fatherChar);
		System.out.println("First  Character  Of  My Surname  Is  :  " + surChar);
	}

}

