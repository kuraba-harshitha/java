/*Adam was learning about storage structure with the help of Roz. Roz's first task was to make Adam understand the concept of array by asking Adam to create an array dynamically and get the inputs into the array and print the array. As Adam had confusion she has approached you for help.
Help Adam by writing a program to create an array , get inputs and print the inputs.

Sample Input:
3
1
2
3

Sample Output:
1

2

3*/
import java.util.Scanner;
public class Print
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for( int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
