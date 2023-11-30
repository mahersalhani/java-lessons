import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[]  items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());
        //list.add("bread");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("bread");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
            List.of("apples", "bananas", "milk", "eggs")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        groceries.remove(0);
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.comparing(String::length));

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
