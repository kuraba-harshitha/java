/*Write a program to get a character as input and print it. When the user enters a character, it is stored in the variable test Character. NOTE: Bold letters or words are Input and the rest are output statements.

Sample Input:

z

Sample Output:

z*/
import java.util.Scanner;
public class InputOutput3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.next().charAt(0);
        System.out.println(c);
    }
}
