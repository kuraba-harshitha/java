/*You are given two vectors v1=(x1,x2,...,xn) and v2=(y1,y2,...,yn). The scalar product of these vectors is a single number, calculated as x1y1+x2y2+...+xnyn.
 Suppose you are allowed to permute the coordinates of each vector as you wish. Choose two permutations such that the scalar product of your two new vectors is the largest possible, and output that maximum scalar product.

Input & Output Format:

Input consists of 1 integer and two arrays.

First input consists of an size of an array.

second inputs consists of elements of two arrays.

Output consists of a one integer.


Sample Input:
3
1 3 5
2 4 1

Sample Output:
27*/import java.util.*;
public class Maximum
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int t;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(a[i]>a[j])
              {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
              }
            }
        }
        for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(b[i]>b[j])
              {
                  t=b[i];
                  b[i]=b[j];
                  b[j]=t;
              }
            }
        }
        int s=0;
        for(int i=0;i<n;i++)
            s+=a[i]*b[i];
            System.out.println(s);
        
    }
}
