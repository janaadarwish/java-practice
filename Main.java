import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(3);
        nums.add(7);
        nums.add(2);

        Shuffle.shuffle(nums);
        System.out.println("Shuffle: " + nums);

        Reverse.reverse(nums);
        System.out.println("Reverse: " + nums);

        System.out.println("Max: " + Max.max(nums));

        System.out.println("Count of 3: " + CountOccurrences.count(nums, 3));

        System.out.println("No duplicates: " + RemoveDuplicates.removeDuplicates(nums));

        System.out.println("Sum: " + Sum.sum(nums));

        Sort.sort(nums);
        System.out.println("Sorted: " + nums);

        System.out.println("Is Sorted: " + IsSorted.isSorted(nums));
    }
    }

