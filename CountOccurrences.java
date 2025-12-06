import java.util.ArrayList;

public class CountOccurrences {

    public static <E> int count(ArrayList<E> list, E element) {
        int c = 0;
        for (E e : list) {
            if (e.equals(element)) {
                c++;
            }
        }
        return c;
    }
}
