/*Write a program to scan the string from the user and to print it

INPUT  & OUTPUT FORMAT: 

Input consists of 1 string.

Output consists of 1 string.

Sample Input:
Cyfuno

Sample Output:

The string is Cyfuno

*/
import java.util.Scanner;
public class String1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("The String is "+s);
    }
}
