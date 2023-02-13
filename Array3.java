/*Array List- String2
Requested files: Array2.java (Download)
Type of work: Individual work
Write a program using ArrayList to print the follwoing output:
ArrayList: [Cat, Dog, Cow]
Element at index 1: Dog*/
//code here
import java.util.*;
public class Array2
{
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        a1.add("Cat");
        a1.add("Dog");
        a1.add("Cow");
        System.out.println("ArrayList: "+a1);
        System.out.println("Element at index 1: "+a1.get(1));   
    }
}
