/*Program to check if a given number is a strong number or not is discussed here. A strong number is a number in which the sum of the factorial of the digits is equal to the number itself.

Input & Output Format:
Input consists of one integer.

Output consists of a string. 

If it is true then display "Strong Number" else display "Not a Strong Number".

Sample Input & Output:

145

Strong Number

*/
import java.util.*;
public class Strong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0,f=1,s=0,a1=0,r=0;
        a1=a;
        while(a>0)
        {
            r=a%10;
            for(i=1;i<=r;i++)
          {
           f=f*i; 
          }
          
          a=a/10;
          s=s+f;
          f=1;
         
        }
          if(s==a1)
          {
            System.out.println("Strong Number");
          }
          else
          {
            System.out.println("Not a Strong Number");
          }
    }
}  
