/*ASCII - American Standard Code for Information Interchange. Write a program to get a character as input and print it's ASCII value. When a character is entered, the character itself  stored.  And when we displayed that value using "int()"  type casting , the entered character is displayed as Ascii value. NOTE: Bold letters or words are Input and rest are output statements.

Sample Input :

g

Sample Output:

103*/
import java.util.Scanner;
public class InputOutput5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.next().charAt(0);
        int a=c;
        System.out.println(a);
    }
}

