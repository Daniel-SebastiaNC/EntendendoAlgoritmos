import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QSort {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(3, 9, 6, 5, 2));

        System.out.println(qSort(array));
    }

    private static List<Integer> qSort(List<Integer> list){
        if (list.size() < 2) {
            return list;
        }

        int size = list.size();
        int pivot = list.get(size/2);

        List<Integer> lows = new ArrayList<>();
        List<Integer> highs = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();


        for (Integer i : list) {
            if (i > pivot){
                highs.add(i);
            } else if (i < pivot){
                lows.add(i);
            } else {
                pivots.add(pivot);
            }
        }
        List<Integer> response = new ArrayList<>();
        response.addAll(qSort(lows));
        response.addAll(pivots);
        response.addAll(qSort(highs));

        return response;

    }



    /*int pivotIndex = list.size() / 2;
    int pivot = list.get(pivotIndex);

    List<Integer> lows = new ArrayList<>();
    List<Integer> highs = new ArrayList<>();
    List<Integer> pivots = new ArrayList<>();

    for (Integer i : list) {
        if (i < pivot) {
            lows.add(i);
        } else if (i > pivot) {
            highs.add(i);
        } else {
            pivots.add(i); // adiciona todos os iguais ao pivô (importante pra valores repetidos)
        }
    }

    List<Integer> sorted = new ArrayList<>();
    sorted.addAll(qSort(lows));
    sorted.addAll(pivots);
    sorted.addAll(qSort(highs));

    return sorted;*/
}
