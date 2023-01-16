package Testing.searchInLine;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchLine {

    public static void main(String[] args) {

        String text = "aabaabaaaaabaaaa";
        String sample = "aabaa";

        System.out.println(Arrays.toString(searchNaive(text, sample).toArray()));
        System.out.println(Arrays.toString(prefixFunction(sample)));

    }

    static ArrayList<Integer> searchNaive(String text, String sample) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        for (int i = 1; i < text.length(); i++) {
            int j = 0;
            while (j < sample.length() && i + j < text.length() && sample.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == sample.length()) {
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }

    static int[] prefixFunction(String sample) {
        int[] values = new int[sample.length()];
        for (int i = 0; i < sample.length(); i++) {
            int j = 0;
            while (i + j < sample.length() && sample.charAt(j) == sample.charAt(i + j)) {
                values[i + j] = Math.max(values[i + j], j + 1);
                j++;
            }
        }
        return values;
    }

}
