/*Program to find if the given numbers are Friendly pair or not (Amicable or not) is discussed here. Friendly Pair are two or more numbers with a common abundance.

Input & Output format: 

Input consists of 2 integers.
The first integer corresponds to number 1 and the second integer corresponds to number 2.
If it is a Friendly Pair display Friendly Pair or displays Not Friendly Pair.
For example,6 and 28 are Friendly Pair.

(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.

Sample Input:
6

28

Sample Output:

Friendly Pair*/
import java.util.Scanner;
public class Friendly
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s1=0,s=0,p=0,q=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                s=s+i;
            }
            p=s/a;
        }
        for( int j=1;j<=b;j++)
        {
            if(b%j==0)
            {
                s1=s1+j;
            }
            q=s1/b;
        }
        if(p==q)
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not Friendly Pair");
        }
    }
}

