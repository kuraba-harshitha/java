/*Define a function which can compute the sum of two numbers using recursion.

sample input:

4

8

Sample output:

12
*/
import java.util.Scanner;
class sotn
{
    public static void main(String args[])
    {
        int sum,x,y;  
      Scanner sc=new Scanner(System.in);
        x=sc.nextInt();                              
        y=sc.nextInt();
        sum=add(x,y);         
        System.out.print(sum);
    } 
    static int add(int x, int y)
    {
         if(y==0)
         {
            return x; 
         }
         else
         {
              return(1+add(x,y-1));
         }
    }
}
