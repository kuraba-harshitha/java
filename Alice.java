/*Alice was bored that day, so she was sitting on the riverbank. Suddenly she notices a talking, White Rabbit with a pocket watch. It ran fast, and she followed it, down a rabbit hole. She fell into the hole and found a magical wonderland with dark trees and beautiful flowers. She found many ways numbered from 1,2,3,...…..18.she was confused about which is the right way that will lead her to her home. She found a cute bird, standing in one of the trees. Alice asked the bird the way to go back to her home. The bird said a two-digit number( say 23 ) and asked her to find the sum of its digits (2+3=5) and that numbered way will lead her to her home. Alice was already confused, so pls help Alice in finding the route to her home... 

Input Format: 

Input consists of an integer corresponding to the 2-digit number. 

Output Format:

Output consists of an integer corresponding to the sum of its digits.

 Refer sample input and output for formatting specifications. [All text in bold corresponds to input and the rest corresponds to output]

SAMPLE INPUT  :

23

SAMPLE OUTPUT:

5

*/
import java.util.Scanner;
public class Alice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=a%10;
        c=a/10;
        System.out.println(b+c);
    }
}
