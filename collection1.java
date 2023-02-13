/*Write a java program using ArrayList to display the following output:

ArrayList: [Cow, Cat, Dog]
Accessing individual elements:  
Cow, Cat, Dog,
*/
//Code here
import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Cow");
        a1.add("Cat");
        a1.add("Dog");
        System.out.println("ArrayList: "+a1);
        String str=a1.get(0);
          String str1=a1.get(1);
         String str2=a1.get(2);
        
        System.out.println("Accessing individual elements:");
        System.out.print(""+str);
        System.out.print(", "+str1);
        System.out.print(", "+str2);
        
    }
}
