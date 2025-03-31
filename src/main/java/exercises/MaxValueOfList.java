//exercises 4.2
package exercises;

import java.util.*;

public class MaxValueOfList {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 4, 15, 6, 1, 5, 3));

        /*
        Minha solução
        System.out.println(maxValueOfList(array, 0));
        */
        System.out.println(maxValueOfList(array));

    }

    private static int maxValueOfList(List<Integer> list){
        var initial = list.get(0);
        if (list.size() == 2) {
            return (initial > list.get(1))? initial : list.get(1);
        }
        /*
        System.out.println(initial);
        int initial = list.remove(0);
        */
        int max = maxValueOfList(list.subList(1, list.size()));
        /*
        System.out.println("max: " +max);
        */
        return (initial > max) ? initial : max;
    }

    /*
    Teste com Sublistas
    private static void sublistTest(List<Integer> list){
        var list1 = list.subList(1, list.size());
        System.out.println(list1);
        var list2 = list1.subList(1, list1.size());
        System.out.println(list2);
    }
    */

    /*
    Minha solução
    private static int maxValueOfList(List<Integer> list, int ant){
        int maxValue;

        if (list.isEmpty()) {
            return ant;
        } else if (list.get(0) > ant){
            maxValue = list.get(0);
        } else {
            maxValue = ant;
        }

        list.remove(0);
        return maxValueOfList(list, maxValue);
    }
    */
}
