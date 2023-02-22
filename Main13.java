/*Remove Array Deque Element: using the clear() method
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:



To remove all the elements from the array deque, we use the clear() method
Sample Output: 

ArrayDeque: [Dog, Cat, Horse]

New ArrayDeque: []*/
import java.util.ArrayDeque;
class Main
{
    public static void main(String[] args) 
    {
        ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayDeque: " + animals);
        animals.clear();
        System.out.println("New ArrayDeque: " + animals);
    }
}
