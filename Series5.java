/*Write a program to generate the following series --- 121,225,361,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

121 225 361 529 729 */
import java.util.Scanner;
public class Series5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=7,b;
        for(int i=1;i<=n;i++)
        {
            a=a+4;
            b=a*a;
            System.out.print(" "+b);
            
        }
        
    }
}

