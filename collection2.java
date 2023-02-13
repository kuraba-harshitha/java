/*Create LinkedList in Java
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

LinkedList: [Dog, Cat, Cow]*/
//Code here
import java.util.*;

class collection
{
  public static void main(String[] args)
  {
    LinkedList<String> l1 = new LinkedList<>();
    l1.add("Dog");
    l1.add("Cat");
    l1.add("Cow");
    System.out.println("LinkedList: " + l1);
  }
}
