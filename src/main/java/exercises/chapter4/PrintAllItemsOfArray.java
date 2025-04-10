//exercises 4.5
package exercises.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllItemsOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        printAllItemsOfArray(list);
    }

    private static void printAllItemsOfArray(List<Integer> list){
        if (list.size() < 2) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.remove(0));
            printAllItemsOfArray(list);
        }
    }
}
