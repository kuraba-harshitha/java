/*Write a  program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December] .

Input Format:

The first line of the input contains an integer which corresponds to the number of the month. [ January is 1, Feb is 2 and so on].  

The second line of the input consists of a floating point number which corresponds to the room rent per day. 

The third line of the input consists of an integer which corresponds to the number of days stayed in the hotel.

Output Format:

Output consists of a single line which displays the hotel tariff to be payed.  

Hotel tariff should be displayed correct to 2 decimal places. 

Refer  sample output  for format details.

Sample Input 1:

3

1500

2

Sample Output 1:

Hotel Tariff: Rs.3000.00

Sample Input 2:

4

2000

2

Sample Output 2:

Hotel Tariff: Rs.4800.00*/
import java.util.Scanner;
public class Hotel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,total,rent;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>12)
        {
            System.out.println("invalid input");
        }
        else if(a==4||a==6||a==11||a==12)
        {
            total=(20*b)/100;
            rent=(total*c)+(b*c);
            System.out.println("Hotel Tariff: Rs."+rent+".00");
        }
        else
        {
            rent=b*c;
            System.out.println("Hotel Tariff: Rs."+rent+".00");
            
        }
    }
}
