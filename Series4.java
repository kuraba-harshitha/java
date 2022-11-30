/*Write a program to generate the following series --- 0.5,1.5,4.5,13.5,...

 Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input & Output:

5

0.5 1.5 4.5 13.5 40.5 

*/
import java.util.Scanner;
public class Series4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        float b=0.5f;
        for(int i=1;i<=n;i++)
        {
            System.out.print(" "+b);
              b=b*3;
        }
    }
}
