/*We are driving down the street and see a green traffic light ahead. Because we know precisely the pattern of this traffic light, we know exactly how long we have before it will turn red. We wish to compute whether we will pass the traffic light before it turns red at our current speed.

Write a program that takes the following floating point numbers as input:

our current speed in meter per seconds (s)
the distance to the light in meters (d)
the time until it turns red in seconds (t)
and displays a message indicating whether we will beat the light. You may assume that the input won't be such that we reach the light at exactly the same time it turns red.

 Input Format:

Input consists of 3 lines.

The first line of the input consists of a floating point number which corresponds to the speed,s.
The second line of the input consists of a floating point number which corresponds to the distance,d.
The third line of the input consists of a floating point number which corresponds to the time, t.
Output Format:

Output consists of a string ("yes" or "no").  

Output yes if we will be able to beat the light at current speed. 

Output no if we won't be able to beat light at current speed.

 Sample Input 1:

59.99

1.0

60.0 

Sample Output 1:

no 

Sample Input 2:

60.01

1

60 

Sample Output 2:

yes*/
import java.util.Scanner;
public class Lights
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        if(a>=c)
        {
            System.out.printf("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
