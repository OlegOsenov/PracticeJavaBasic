package Testing.SordetArray;

public class ArrSorted {
    public static void main(String[] args) {

        int[] array = new int[]{3, 4, 1, 6, 9, 5, 6, 4};


    }

    private static int min(int[] array){
        int minIndex = 0;
        int minValue = array[0];
        for (int q = 0; q < array.length; q++) {
            if (array[q] < minValue){
                minValue = array[q];
                minIndex = q;
            }

        }
        return minIndex;
    }
}
