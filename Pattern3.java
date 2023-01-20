public class Pattern3
{
	public static void main(String[]a)
	{
		for (int j = 1; j<=5; j++) {
			//j=3
			for (int i = 1; i<=j; i++) {//i=1 1<=5
				System.out.print(i+"");//1 
				                       //12 
				                       //123 
				                       //1234 
				                       //12345
			}                            
			System.out.println();//new line
		}
	
		
	}
}
