public class Pattern5
{            
        public static void main(String[] args) {
            int i, j, k = 1;
            for (i = 1; i <= 5; i++) //rows 
            {
                for (j = 1; j<=i; j++) //column 
                {
                    System.out.print(k++ + " "); //add +1 to the column element
                }
       
                System.out.println();
            }
        }
       
    } 