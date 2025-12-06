import java.util.*;

public class Sort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;

            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    public static void demo() {
        int[] array = {5, 2, 9, 1, 7};
        selectionSort(array);

        System.out.print("Selection sorted: ");
        for (int n : array) System.out.print(n + " ");
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3); list.add(1); list.add(2);
        Collections.sort(list);
        System.out.println("Collections.sort: " + list);
    }
}
