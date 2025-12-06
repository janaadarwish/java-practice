//*13.3 (Sort ArrayList) Write the following method that sorts an ArrayList of numbers: public
//static void sort(ArrayList list)
import java.util.ArrayList;

public class Sort {

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            E temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}

