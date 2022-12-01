/*Write a  program to count the distinct elements in an array:

Input & Output Format:

Input consists of 1 integer and 1 array.

First input consists of size of an array.

Second inputs corresponds to the array elements.

Output consists of one integer and corresponds to the count of the distinct elements.

Sample Input:

6
2
6
6
4
5
5

Sample Output:
4

*/import java.util.Scanner;
public class Countdistinct
{
    public static void main(String[] args)
    {
        //Write your code
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,temp;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
     for (int i=0;i<n;i++) 
     {    
        for (int j=i+1;j<n;j++) 
        {     
           if(a[i]>a[j]) 
           {    
               temp=a[i];    
               a[i]=a[j];    
               a[j]=temp;    
           }     
        } 
      }
      for (int i=0;i<n;i++)
      {
         while (i<n-1&&a[i]==a[i+1])
         {
           i++;
         }
         c++;   
      }
      System.out.println(c);
    }
}
