import java.util.ArrayList;

public class Reverse {

    public static <E> void reverse(ArrayList<E> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            E temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
