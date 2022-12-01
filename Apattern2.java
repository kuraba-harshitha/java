/*Solve the pattern in dynamic:

 

Sample input 1:

5

Sample output 1:

*****

** **

* * *

** **

*****

*/
//Start your coding dear programmers
import java.util.Scanner;
public class Apattern2
{
    public static void main(String args[])
    {
        Scanner ms= new Scanner(System.in);
        int n=ms.nextInt();
        for (int i = n; i >= 0; i--)
        {
           for (int j = 0; j <= i; j++)
           {
              System.out.print( "* ");
           }
           System.out.println();
        }
        for (int i = 0; i<= n; i++)
        {
           for (int j = 0; j <= i; j++)
           {
                System.out.print( "*");
           }
           System.out.println();
        }
    }
}
