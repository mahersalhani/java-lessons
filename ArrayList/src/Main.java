import java.util.ArrayList;
import java.util.Arrays;

record GeroceryItem(String name, String tpye, int count) {
    public GeroceryItem(String name) {
        this(name, "Daily", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), tpye);
    }
}

public class Main {
    public static void main(String[] args) {
        GeroceryItem[] groceryArray = new GeroceryItem[3];
        groceryArray[0] = new GeroceryItem("Milk");
        groceryArray[1] = new GeroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GeroceryItem("Bread", "BAKERY", 2);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GeroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GeroceryItem("Milk"));
        groceryList.add(new GeroceryItem("apples", "PRODUCE", 6));
        groceryList.add(new GeroceryItem("Bread", "BAKERY", 2));
        groceryList.set(0, new GeroceryItem("eggs", "DAIRY", 12));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}
