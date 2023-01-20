//Write your own program using logical operators.


import java.util.Scanner;
public class LogicalOp_A5 {
	public static void main(String[] args) {
// initializing variables
		int a =0, b = 0, c = 0, d = 0;
        
		Scanner scan=new Scanner(System.in);
// Displaying a, b, c
		System.out.println("a = ");
		a=scan.nextInt();
		System.out.println("b = ");
		b=scan.nextInt();
		System.out.println("c = ");
		c=scan.nextInt();

// using logical AND to verify
// two constraints
		if ((a < b) && (b == c)) 
		{
			d = a + b + c;
			System.out.println("The sum is: " + d);
		} else
			System.out.println("False conditions");
	}
}
