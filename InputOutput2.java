/*Write a program to get float as input and print it. When the user enters a float, it is stored in the variable test Float. Use '%.2f' in the print() to display float value with 2 precisions. NOTE: Bold letters or words are Input and the rest are output statements.

Sample Input :

56.2425

Sample Output :

56.24

*/
import java.util.Scanner;
public class InputOutput2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        a=sc.nextFloat();
        System.out.printf("%.2f",a);
    }
}
