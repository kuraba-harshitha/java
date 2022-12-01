/*Write a  program to remove the duplicate elements from an array:
INPUT FORMAT:

Input consists of 1 integer and 1 array.

The first integer corresponds to the size of the array.

The next integers correspond to the elements in the array.

OUTPUT FORMAT:

The output consists of an array with no duplicate elements.

Sample Input:
5

1

2

3

4

4

Sample Output:

1 2 3 4 */
import java.util.*;
public class Remove
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int arr[]=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c=c+1;
                }
            }
             if(c==0)
             {
            System.out.print(arr[i] +" ");
             }
          c=0; 
        }
        
    }
}
