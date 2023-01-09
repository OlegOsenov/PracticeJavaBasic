package Testing;

import java.util.Arrays;

public class ArrSorted {
    public static void main(String[] args) {

        int[] array = new int[]{2,1,4,3,5,6,9,8,7,10};

        for (int step = 0; step < array.length; step++) {
            int index = minSorted(array,step);
            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
        System.out.println(Arrays.toString(array));

    }

    private static int minSorted(int[] array, int start){
        int minIndex = start;
        int minValye = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValye){
                minValye = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
