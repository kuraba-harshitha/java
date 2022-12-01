/*This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.



Input:

4

Output:

32

Input:

3

Output:

27

*/
import java.util.Scanner;
public class oddeve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n*8);
        }
        else
        {
            System.out.println(n*9);
        }
    }
}
