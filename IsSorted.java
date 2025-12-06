import java.util.ArrayList;

public class IsSorted {

    public static <E extends Comparable<E>> boolean isSorted(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
