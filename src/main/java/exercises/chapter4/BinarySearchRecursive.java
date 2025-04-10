package exercises.chapter4;

import java.util.*;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        int response = binarySearchRecursive(list, 3);
        if (response == -1) {
            System.out.println("Item Not Found!");
        } else {
            System.out.println("Index: " + response);
        }
    }

    private static int binarySearchRecursive(List<Integer> list, int item){
        int mid = list.size()/2;
        /*System.out.println(mind);*/
        if (list.get(mid) == item) {
            return mid;
        } else if (mid == 0) {
            return -1;
        } else if (list.get(mid) > item) {
            return binarySearchRecursive(list.subList(0, mid), item);
        } else {
            return binarySearchRecursive(list.subList(mid + 1, list.size()), item);
        }

    }

}
