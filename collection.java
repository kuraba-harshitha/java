/*Remove ArrayList Elements
Requested files: collection.java (Download)
Type of work: Individual work
Write a java program using ArrayList to display the following output:

ArrayList: [Dog, Cat, Horse]
Updated ArrayList: [Dog, Cat]
Removed Element: Horse*/
//Code here
import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("Dog");
        a1.add("Cat");
        a1.add("Horse");

        System.out.println("ArrayList: "+a1);
        String str=a1.remove(2);
        System.out.println("Updated ArrayList: "+a1);
        System.out.println("Removed Element: "+str);
      
    }
}
