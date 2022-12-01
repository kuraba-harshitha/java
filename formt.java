/*Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
Input:
5.5589
Output:
5.56 
*/


import java.util.Scanner;
public class formt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.printf("%.2f",n);
    }
}
