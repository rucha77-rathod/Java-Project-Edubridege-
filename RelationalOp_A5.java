//Write your own program using relational operators?

import java.util.Scanner;
public class RelationalOp_A5 {
	public static void main(String[] args) {
// Initializing variables
  int a = 0, b = 0, c = 0;
 Scanner scan=new Scanner(System.in);
		System.out.println("a = ");
		a=scan.nextInt();
		System.out.println("b = ");
		b=scan.nextInt();
		System.out.println("c = ");
        c=scan.nextInt();

// Comparing a and b and
// printing corresponding boolean value 
		System.out.println("a == b: " + (a == b));

// Comparing a and c and
// printing corresponding boolean value 
		System.out.println("a == c: " + (a == c));

	}

}
