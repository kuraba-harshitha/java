/*Write program to reverse a number is discussed here. We can reverse a number using loop and arithmetic operators in both iterative and recursive approaches. 

Input & Output Format:

Input consists of a integer.

Output consists of reversed input.

Sample Input: 

13579

Sample Output: 

97531*/
import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,rev=0;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}
