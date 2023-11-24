import java.util.ArrayList;

public class LongestConsecutive {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList (already sorted)
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(10);

        ArrayList<Integer> longestConsecutiveSubsequence = new ArrayList<>();
        ArrayList<Integer> currentConsecutiveSubsequence = new ArrayList();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0 && arrayList.get(i) == arrayList.get(i - 1) + 1) {
                currentConsecutiveSubsequence.add(arrayList.get(i - 1));
            } else {
                currentConsecutiveSubsequence = new ArrayList<>();
            }

            if (currentConsecutiveSubsequence.size() > longestConsecutiveSubsequence.size()) {
                longestConsecutiveSubsequence = currentConsecutiveSubsequence;
            }
        }

        System.out.println("Original ArrayList: " + arrayList);

        // Print the longest consecutive subsequence
        System.out.println("Longest Consecutive Subsequence: " + longestConsecutiveSubsequence);
    }
}