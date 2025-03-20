import java.util.Optional;

public class BinarySearch {

    public static void main(String[] args) {
        int[] lista = {1, 3, 5, 7, 9};

        System.out.println("-----------------------");
        int search1 = binarSearch(lista, 7);
        System.out.println(search1);
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        int search2 = binarSearch(lista, -1);
        System.out.println(search2);
        System.out.println("-----------------------");

        System.out.println("-----------------------");
        int search3 = binarSearch(lista, 8);
        System.out.println(search3);
        System.out.println("-----------------------");
    }

    private static int binarSearch(int[] lista, int item){
        int max = lista.length - 1;
        int min = 0;

        while (min <= max){
            /*
            --Values min and max--
            System.out.println("=====================================");
            System.out.println("min: " + min);
            System.out.println("max: " + max);
            */

            var mid = (min + max)/2;
            var guess = lista[mid];

            /*
            --Value mid--
            System.out.println("mid: " + mid);
            */

            if (guess == item) {
                return mid;
            } else if (guess < item) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        //Not Founded
        return -1;
    }
}
