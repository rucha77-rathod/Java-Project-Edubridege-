//Write your own program to show the use of assignment operator?

public class AssignmentOp2_A5 {

	public static void main(String[] args) 
	{
		int x = 20, y = 30, z = 50;
		x += y;
		y -= x + z;
		z *= x * y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
}
