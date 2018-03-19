package beginner;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){

        int dimensionOfArray = 10;
        int[] array = SearchMinMax.createArray(dimensionOfArray);

        System.out.println("Before "+ Arrays.toString(array));

        int[] sortedArray = mergeSort(array);

        System.out.println("After "+Arrays.toString(sortedArray));

    }

    private static int[] mergeSort(int[] array){
        int len = array.length;
        if (len < 2) return array;
        int mid = len/2;

//        System.out.println(" Left "+Arrays.toString(Arrays.copyOfRange(array, 0, mid)));
//        System.out.println(" Right "+Arrays.toString(Arrays.copyOfRange(array, mid, len)));

        return merge(mergeSort(Arrays.copyOfRange(array, 0, mid)),
                mergeSort(Arrays.copyOfRange(array, mid, len)));
    }

    private static int[] merge(int[] arr_1, int[] arr_2) {

//        System.out.println(" merge ");
//        System.out.println(Arrays.toString(arr_1));
//        System.out.println(Arrays.toString(arr_2));

        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - counters in the arrays
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }

//        System.out.println(Arrays.toString(result));
        return result;
    }


}
