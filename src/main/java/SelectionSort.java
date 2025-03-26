import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>(Arrays.asList(3, 9, 6, 5, 2));

        //Test Value findIndexMinValue and findIndexMaxValue
        /*System.out.println(findIndexMinValue(array));
        System.out.println(findIndexMaxValue(array));*/

        System.out.println("Sort Ascending: ");
        array = sortAscending(array);
        System.out.println(array);


        System.out.println("Sort Descending: ");
        array = sortDescending(array);
        System.out.println(array);


    }


    //Sort Ascending
    private static int findIndexMinValue(List<Integer> array){
        int index = 0;
        int min = array.get(index);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
                index = i;
            }
        }
        return index;
    }

    private static List<Integer> sortAscending(List<Integer> array){
        List<Integer> newArray = new ArrayList<>();
        var size = array.size();
        for (int i = 0; i < size; i++) {
            /*
            System.out.println(i);
            System.out.println(arr);
            */
            newArray.add(array.remove(findIndexMinValue(array)));
        }
        return newArray;
    }

    //Sort Descending:
    private static int findIndexMaxValue(List<Integer> array){
        int index = 0;
        int max = array.get(index);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
                index = i;
            }
        }
        return index;
    }

    private static List<Integer> sortDescending(List<Integer> array){
        List<Integer> newArray = new ArrayList<>();
        var size = array.size();


        for (int i = 0; i < size; i++) {
            /*System.out.println(i);
            System.out.println(array);*/
            newArray.add(array.remove(findIndexMaxValue(array)));
        }

        return newArray;
    }
}
