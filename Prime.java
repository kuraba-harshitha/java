/*Write a program to find whether the given number is Prime number or Not.

Input & Output Format:

Input consists of one integer.

Output consists of a string.

If it is prime then display "Prime Number" or if it is not prime then display "Not a Prime"

Sample Input:

2

Sample Output:

Prime Number*/
import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        if(n<=1)
        {
            System.out.println("Not a Prime");
        }
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime");
        }
    }
}
