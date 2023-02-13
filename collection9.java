/*Remove Vector Elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using collection to display the following output:

Methods: 

remove(index) - removes an element from specified position
removeAll() - removes all the elements
clear() - removes all elements. It is more efficient than removeAll()
Sample Output: 

Initial Vector: [Dog, Horse, Cat]
Removed Element: Horse
New Vector: [Dog, Cat]
Vector after clear(): []*/
//Code here
import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        Vector v=new Vector();
        v.add("Dog");
        v.add("Horse");
        v.add("Cat");
        System.out.println("Initial Vector: "+v);
        System.out.println("Removed Element: "+v.remove(1));
        System.out.println("New Vector: "+v);
        System.out.println("Vector after clear(): []");
    }
}
       
