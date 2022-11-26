/*Write a program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.*/
/* Input format:
First input: an integer 
Second input: an integer 
Output format:
First output will be the sum of two integers
Second output will be the difference of two integers
Sample Input:
55
34
Sample Output:
89
21*/
import java.util.Scanner;
public class SumDiff
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int a,b,c,d;
     a=sc.nextInt();
     b=sc.nextInt();
     c=a+b;
     d=a-b;
     System.out.println(c);
     System.out.println(d);
    }
}


