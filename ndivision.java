/*Write a program that will find all such numbers which are divisible by 7 but are not a multiple of 5. The numbers obtained should be printed in a comma-separated sequence on a single line.

Input Format:
The first line consists of an integer value as starting value
The second line consists of an integer value as the ending value.

Output Format:
The output consists of numbers that are all divisible by 7 and are not a multiple of 5 with the given range.

Sample input:
1
25

Sample Output:
7 14 21

*/
import java.util.Scanner;
public class ndivision
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<b;i++)
        {
            if(i%7==0 && i%5!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
