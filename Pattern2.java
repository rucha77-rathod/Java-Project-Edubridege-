public class Pattern2
{
	public static void main(String[]a)
	{
		for (int j = 1; j<=5; j++) {
			//j=3
			for (int i = 5; i>=j; i--) {//i=5 5>=1
				System.out.print("1");//11111 1111 111 11 1
			}                            
			System.out.println();//new line
		}
	
		
	}
}
