//exercises 4.1
package exercises.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(Arrays.asList(2, 4, 6));

        System.out.println("sum: " + sum(array));

    }

    private static int sum(List<Integer> array){
        if (array.isEmpty()) {
            return 0;
        }

        /* return array.remove(0) + sum(array);*/
        return array.get(0) + sum(array.subList(1, array.size()));

    }

}
