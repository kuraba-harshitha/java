/*Write a program to generate the following series --- 1, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

1 2.0 3.0 6.0 9.0 */
import java.util.Scanner;
public class Series7
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double p=1,q=2;
        System.out.printf("%.0f %.1f ",p,q);
        for(int i=1;i<a-1;i++)
        {
            if(i%2==1)
            {
                p=p*3;
                System.out.printf("%.1f ",p);
            }
            else
            {
                q=q*3;
                System.out.printf("%.1f ",q);
            }
        }
    }
}
