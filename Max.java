import java.util.ArrayList;

public class Max {

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for (E e : list) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
}
