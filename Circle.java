/*
In this problem you must write a program that determines if two circles intersect each other. The input to your program will be the <x, y> coordinates for the center of each circle, followed by the radius(r) of each circle. The output will state whether the circles overlap, do not overlap, or are tangential (i.e., tangential circles touch each other at just one common point).

Input Format:

Input consists of 6 integers. The first integer corresponds to the x-coordinate of the centre of the first circle. The second integer ccorresponds to the y-coordinate of the centre of the first circle. The third integer corresponds to the radius of the first circle. The next 3 integers correspond to the x,y and radius of the second circle.

Output Format:

The output consists of a single line which contains any of these 3 strings --- “The circles are tangential”, “The circles overlap”, “The circles do not overlap”

Sample Input 1:

10

10

3

10

6

1

Sample Output 1:

The circles are tangential

Sample Input 2:

8

8

3

8

4

2

Sample Output 2:

The circles overlap
*/
import java.util.Scanner;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int r=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int r1=sc.nextInt();
        double d=0;
        d=Math.sqrt(((x-x1)*(x-x1))+((y-y1)*(y-y1)));
        if(d==(r+r1))
        System.out.println("The circles are tangential");
        else if(d>(r+r1))
        System.out.println("The circles do not overlap");
        else
        System.out.println("The circles overlap");
    }
}
