//exercises 4.2
package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {

    public static void main(String[] args) {
        List<String> shoppingCart = new ArrayList<>(Arrays.asList("Banana", "Apple", "Rice", "Juice"));

        System.out.println("count: " + count(shoppingCart));
    }

    private static int count(List<String> list){
        if (list.isEmpty()) {
            return 0;
        }

        /*list.remove(0);*/
        return 1 + count(list.subList(1, list.size()));
    }
}
