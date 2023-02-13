/*Change Elements of a LinkedList
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Java, Python, JavaScript, Java]
Updated LinkedList: [Java, Python, JavaScript, Kotlin]*/
import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("Java");
        l1.add("Python");
        l1.add("JavaScript");
        l1.add("Java");
        System.out.println("LinkedList: "+l1);
        l1.add("Kotlin");
        System.out.print(" UpdatedLinkedList: "+l1);
        
    }
}
