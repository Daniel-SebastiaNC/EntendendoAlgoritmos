//exercises 4.8
package exercises.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyAllItemsOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(8, 2/*, 3, 4, 5, 6*/));

        System.out.println(multiplyAllItemsOfArray(list));
    }

    private static List<Integer> multiplyAllItemsOfArray(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            var itemI = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.println("i: "+ itemI);
                System.out.println("j: " + list.get(j));
                var number = itemI * list.get(j);
                System.out.println("number: " + number);
                list.remove(j);
                list.add(j, number);
                System.out.println(list);
            }

        }

        return list;
    }
}
