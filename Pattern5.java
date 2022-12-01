/*Write a Python program to print the given pattern from user-defined values(dynamic values).

Sample input 1:
5
Sample output 1:
    *
   **
  ***
 ****
*****

Sample input 2:
8
Sample output 2:
       *
      **
     ***
    ****
   *****
  ******
 *******
********

*/
import java.util.Scanner;
public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
