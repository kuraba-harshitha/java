/*Write a program that creates integer array of 10 elements, accepts values of arrays and Find Sum, Average, Min, Max.
Sample Input: 

Enter 10 array elements

1

2

3

4

5

6

7

8

9

10

Sample Output

Array: 

sum: 55

min: 1

max: 10

average : 5.5
*/

import java.util.Scanner;
public class Summinmax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        float s=0;
        System.out.println("Enter 10 array elements");
        System.out.println("Array:");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]<a[j])
                {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            s=s+a[i];
        }
        System.out.printf("sum: %.0f\n",s);
        System.out.println("min: "+a[9]);
         System.out.println("max: "+a[0]);
         System.out.printf("average : %.1f",s/10);
    }
}
