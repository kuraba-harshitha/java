/*The college ground is rectangular in shape. The Management decides to build a fence around the ground. In order to help the construction workers to build a straight fence, they planned to place a thick rope around the ground. They wanted to buy only the exact length of the rope that is needed. They also wanted to cover the entire ground with a thick carpet during rainy season. They wanted to buy only the exact quantity of carpet that is needed. They requested your help. Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carper that is required? 

Input Format: 

Input consists of 2 integers. 

The first integer corresponds to the length of the ground 

The second integer corresponds to the breadth of the ground. 

Output Format:  

First output is corresponds to the length of the rope.

Second output is corresponds to the quantity of the carpet.

SAMPLE  INPUT:

50

20

SAMPLE OUTPUT:

Required length is 140 m

Required quantity of carpet is 1000 sqm

*/
import java.util.Scanner;
public class Fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int a=2*(l+b);
        char m='m';
        String s="sqm";
        System.out.println("Required length is " + a +" "+m);
        System.out.println("Required quantity of carpet is " + (l*b) +" "+s);
    }
}
