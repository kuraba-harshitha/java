/*Write a Python Program to solve the pattern in dynamic.

Sample Input 1:
5
Sample Output 1:
*****
*****
*****
*****
*****
Sample Input 2:
7
Sample Output 2:
*******
*******
*******
*******
*******
*******
******* */
import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
