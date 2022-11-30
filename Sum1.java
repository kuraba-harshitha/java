/*Write a program to find the sum of first N natural numbers.

Input & Output Format:

Input consists of one integer.

Output consists of a integer.

Sample Input & Output:

5

15*/
import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println(s);
    }
}
