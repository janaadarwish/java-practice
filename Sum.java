import java.util.ArrayList;

public class Sum {

    public static int sum(ArrayList<Integer> list) {
        int s = 0;
        for (int n : list) {
            s += n;
        }
        return s;
    }
}
