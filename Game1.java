/*Sabrina and Theo were friends. They felt very bored and decided to play a game with calendar and number of days. Sabrina will give the month and the year as input, and Theo wants to find the number of days in that month. Write a C program using switch case and help Sabrina to find the answer. You should check whether the given year is a leap year. If it is a leap year it will have 29 days in February.

Input & Output Format:

Input consists of two integers.

First input consists of  a month.

Second input consists of a year.

Output consists of a integer.


Sample Input:

3

1996

Sample Output:
Number of days is 31*/
import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        if(m==2)
        {
            if(y%4==0||y%100==0||y%400==0)
            {
                System.out.println("Number of days is 29");
            }
            else
            {
                System.out.println("Number of days is 28"); 
            }
        }
        else if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
        {
             System.out.println("Number of days is 31");
        }
        else
        {
             System.out.println("Number of days is 30");
        }
    }
}
    
