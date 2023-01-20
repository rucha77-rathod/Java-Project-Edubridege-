//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output should be 54321.

public class Reverse_num_A4 {
	public static void main(String args[]) {
		int num = 12345;
		int reversenum = 0;
		while (num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}
		System.out.println("reverse the given number:" + reversenum);
	}
}