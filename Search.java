/*Write a program to search an element whether it is present in the array or not:
Input & Output Format:

Input consists of 2 integer and 1 array.

First input consists of a size of an array.

second give the array elements as input.

Third input consists of the element that you want to search.

Output consists of a string. 

If the element is present print the value and display " is present in the array" or else 

"is not present in the array"

Sample Input:
3

10

15 

5

10

Sample Output:

10 is present in the array

*/
import java.util.Scanner;
public class Search
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int flag=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println(s+" is present in the array");
        }
        else
        {
            System.out.println(s+" is  not present in the array");
        }
    }
}
