//exercises 4.6
package exercises.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateAllItemsOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        duplicateAllItemsOfArray(list);
       /* System.out.println(list);*/

    }

    /*Meu jeito*/
    private static void duplicateAllItemsOfArray(List<Integer> list){
        int i = list.get(0) * 2;
       /* System.out.println(i);*/

        list.remove(0);
        list.add(0, i);

        /*System.out.println(list);*/
        if(list.size() < 2){
            return;
        }

        duplicateAllItemsOfArray(list.subList(1, list.size()));
    }

    /*
    Tradicional
    private static List<Integer> duplicateAllItemsOfArray(List<Integer> list){
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            duplicateList.add(list.get(i) * 2);
        }

        return duplicateList;
    }
    */
}
