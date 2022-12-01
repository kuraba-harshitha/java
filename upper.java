/*Write a program that accepts a sentence and calculate the number of upper case letters and lower case letters.

Suppose the following input is supplied to the program:

Sample input:

Hello world!

Sample output: 

UPPER CASE 1

LOWER CASE 9

*/
import java.util.Scanner;
public class upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int count1=0;
        char[] ch=str.toCharArray();
        for(char chh:ch)
        {
            if(chh>='A' && chh<='Z'){
                count=count+1;
            }
            else if(chh>='a' && chh<='z'){
                count1=count1+1;
            }
            else{
                continue;
            }
        }
        System.out.println(" UPPER CASE "+count);
        System.out.println("LOWER CASE "+count1);
    }
}
