//exercises 4.7
package exercises.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateFirstValueOfArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(8, 2, 3, 4, 5, 6));
        duplicateFirstValueOfArray(list);

        System.out.println(list);
    }

   private static void duplicateFirstValueOfArray(List<Integer> list){
       int i = list.get(0) * 2;
       list.remove(0);
       list.add(0, i);
   }
}
