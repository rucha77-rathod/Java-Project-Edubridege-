//program to read temperature in centigrade and display a suitable message

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		String weather;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the temperature: ");

		int temp = scan.nextInt();
		if (temp <= 0)
			weather = "freezing";
		else if (temp > 0 && temp <= 30)
			weather = "normal";
		else if (temp > 31 && temp <= 40)
			weather = "Hot";
		else
			weather = "very Hot";
		System.out.println("weather condition: " + weather);
	}
}