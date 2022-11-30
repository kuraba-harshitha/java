/*Program to check whether a given number is a perfect number or not is discussed here. A perfect number is a number which is equal to the sum of its proper positive divisors.

For example, 6 is a perfect number.

The divisors of 6 are 1, 2 and 3.

1 + 2 + 3 = 6.

Input & Output Format:

Input consists of one integer.

Output consists of a string. If it is a perfect number then display "Perfect Number" or else display "Not a Perfect Number".

Sample Input:

6

Sample Output:

Perfect Number*/
import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
        
    }
}
