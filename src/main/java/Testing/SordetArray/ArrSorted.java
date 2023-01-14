package Testing.SordetArray;

import java.util.Arrays;

public class ArrSorted {
    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 1, 6, 9, 5, 6, 4};

        for (int stepa = 0; stepa < array.length; stepa++) {
            int index = min(array,stepa);
            int tmp = array[stepa];
            array[stepa] = array[index];
            array[index] = tmp;
        }

        System.out.println(Arrays.toString(array));


    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int q = start + 1; q < array.length; q++) {
            if (array[q] < minValue) {
                minValue = array[q];
                minIndex = q;
            }

        }
        return minIndex;
    }
}
