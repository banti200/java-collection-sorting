import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("First Fruit: " + fruits.get(0));
    }
}
