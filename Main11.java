/*Access Array Deque using peek(), peekFirst() and peekLast() method
Requested files: Main.java (Download)
Type of work: Individual work
Write a program in collection to print the following output:

Access elements using peek(), peekFirst() and peekLast() method

peek() - returns the first element of the array deque
peekFirst() - returns the first element of the array deque (equivalent to peek())
peekLast() - returns the last element of the array deque
Sample Output: 


ArrayDeque: [Dog, Cat, Horse]
Head Element: Dog
First Element: Dog
Last Element: Horse
*/
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
        String element = animals.peek();
        System.out.println("Head Element: " + element);
        String firstElement = animals.peekFirst();
        System.out.println("First Element: " + firstElement);
        String lastElement = animals.peekLast();
        System.out.println("Last Element: " + lastElement);
    }
}
