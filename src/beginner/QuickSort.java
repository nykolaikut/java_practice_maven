package beginner;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){

        int dimensionOfArray = 24;
        int[] array = SearchMinMax.createArray(dimensionOfArray);

        System.out.println("Before "+Arrays.toString(array));

        int begin = 0;
        int end = array.length-1;

        quickSort(array, begin, end);

        System.out.println("After "+Arrays.toString(array));

    }

    private static void quickSort(int[] array, int begin, int end){
        int mid = (begin + end)/2;
        int startElement = array[mid];

        int i = begin, j = end;
        while (i <= j) {
            while (array[i] < startElement) {
                i++;
            }
//            System.out.println("i= "+i);
            while (array[j] > startElement) {
                j--;
            }
//            System.out.println(" j= "+j);
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
//        System.out.println("i= "+i+"; j= "+j);
//        System.out.println(mid+" "+array[mid]);
//        System.out.println(Arrays.toString(array));

        if (begin < j)
            quickSort(array, begin, j);

        if (end > i)
            quickSort(array, i, end);
    }
}
