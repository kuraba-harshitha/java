/*Write a program to check whether the given character is vowel or consonant or Not an alphabet.

Input format: 

The input consist of a character 

Output format: 

The output consists of a below-given string “Vowel” / “Consonant” / “Not an alphabet”

Sample Input: 

a 

Sample Output: 

Vowel*/
import java.util.Scanner;
public class Vowcons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n;
        n=sc.next().charAt(0);
        if(n>='a' && n<='z')
        {
        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') 
        {
            System.out.println("vowel");
        }
        else 
        {
            System.out.println("consonant");
        }
        }
        else
        {
            System.out.println("Not an alphabet");
        }
    }
}
