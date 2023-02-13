/*Array List- Update list
Requested files: Array3.java (Download)
Type of work: Individual work
Write a program using ArrayList to print the follwoing output:
ArrayList: [Java, Kotlin, C++]
Modified ArrayList: [Java, Kotlin, JavaScript]*/
import java.util.*;
public class Array3
{
    public static void main(String args[])
    {
        ArrayList a1=new ArrayList();
        a1.add("Java");
        a1.add("Kotlin");
        a1.add("C++");
        System.out.println("ArrayList: "+a1);
        a1.remove("C++");
        a1.add("JavaScript");
        System.out.println("Modified ArrayList: "+a1);
        
          
    }
}
