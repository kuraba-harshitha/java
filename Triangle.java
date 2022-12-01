/*
Write a program to validate the side of the triangle.  Get three sides measurement from user and validate the triangle. 

Sample Input:

Enter the value for side1

10

Enter the value for side2

10

Enter the value for side3

10

Sample output-1


Sides form a triangle

Sample Input-2

Enter the value for side1

1

Enter the value for side2

2

Enter the value for side3

3

Sample output-2

Sides does not form a Triangle

hint: if(((first+second)>third) && ((first+third)>second) && ((second+third)>first))
*/


import java.util.*;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for side1");
        int a=sc.nextInt();
        System.out.println("Enter the value for side2");
        int b=sc.nextInt();
        System.out.println("Enter the value for side3");
        int c=sc.nextInt();
        if(a>0&&b>0&&c>0)
        {
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a))
        {
            System.out.println("Sides form a triangle");
        }
        else
        {
            System.out.println("Sides does not form a Triangle");
        }
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
    }
}
