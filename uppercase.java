/*Write a program that accepts sequence of lines as input and prints the lines after making all characters in the sentence capitalized.

input

Hello world

output


HELLO WORLD

*/
import java.util.Scanner;
public class uppercase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=str.toUpperCase();
        System.out.println(s);
    }
}
