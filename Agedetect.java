/*Write a program that asks a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). The program is to correctly write out the user’s age in years.

Input Format:

Input consists of 2 integers. 

The first integer corresponds to the last 2 digits of the birth year. 

The second integer corresponds to the last 2 digits of the current year.

Output Format:

Refer sample input and output for further formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output]

Sample Input and Output:

Enter Year of Birth

62

Enter Current year

99

Your age is 37

The program will have to determine when a two digit value such as "62" corresponds to a year in the 20th century ("1962") or the 21st century. Here is another run of the program, where "00" is taken to mean the year 2000:

Enter Year of Birth

62

Enter Current year

00

Your age is 38

 Assume that ages are not negative. Another run of the program:

 Enter Year of Birth

27

Enter Current year

07

Your age is 80

In the following run, the age of the person could be 6 or 106 depending on the assumptions. Assume that the age will always be less than or equal to 100.

 Enter Year of Birth

01

Enter Current year

07

Your age is 6

 Enter Year of Birth

62

Enter Current year

99

Your age is 37

*/
import java.util.Scanner;
public class Agedetect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year of birth");
        int a=sc.nextInt();
        System.out.println("Enter Current year");
        int b=sc.nextInt();
        if(b<a)
        {
            System.out.printf("Your age is %d",(100-a)+b);
        }
        else
        {
            System.out.printf("Your age is %d",b-a);
        }
    }
}
