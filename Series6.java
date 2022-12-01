/*Write a program to generate the following series --- 0,2,8,14,...,34 

Input format: 

The input containing an integer which denotes 'n'

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

0 2 8 14 24 

*/
import java.util.Scanner;
public class Series6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                a=i*i-2;
                System.out.print(" "+a);
            }
            else
            {
                b=i*i-1;
                System.out.print(" "+b);
            }
        }
    }
}
