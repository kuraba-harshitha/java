/*Access LinkedList elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Python, Java, JavaScript]
Element at index 1: Java
*/
//Code here
import java.util.*;

class collection
{
  public static void main(String[] args)
  {
    LinkedList<String> l1 = new LinkedList<String>();
    l1.add("Python");
    l1.add("Java");
    l1.add("Java");
    System.out.println("LinkedList: " + l1);
    System.out.println("Element at index 1: "+l1.get(1));
    
    
  }
}
