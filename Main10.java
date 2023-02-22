/*Access Array Deque Elements
Requested files: Main.java (Download)
Type of work: Individual work
ArrayDeque: [Dog, Cat, Horse]
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
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);
    }
}
