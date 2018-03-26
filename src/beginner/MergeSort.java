package beginner;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){

        int dimensionOfArray = 15;
        int[] array = SearchMinMax.createArray(dimensionOfArray);

        System.out.println("Before " + Arrays.toString(array));

        int[] sortedArray = mergeSort(array);

        System.out.println("After " + Arrays.toString(sortedArray));

    }

    private static int[] mergeSort(int[] array){
        int len = array.length;
        if (len < 2) return array;
        int mid = len/2;

//        System.out.println(" Left " + Arrays.toString(Arrays.copyOfRange(array, 0, mid)));
//        System.out.println(" Right " + Arrays.toString(Arrays.copyOfRange(array, mid, len)));

        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, mid, len));

        return merge(leftArray,rightArray);
    }

    private static int[] merge(int[] leftArr, int[] rightArr) {

//        System.out.println(" call method merge: left array" + Arrays.toString(leftArr));
//        System.out.println(" call method merge: right array " + Arrays.toString(rightArr));

        int leftLength = leftArr.length, rightLength = rightArr.length;
        int leftInd = 0, rightInd = 0;
        int len = leftLength + rightLength;

        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            if (leftInd < leftLength && rightInd < rightLength) {
                if (leftArr[leftInd] > rightArr[rightInd]) result[i] = rightArr[rightInd++];
                else result[i] = leftArr[leftInd++];
            } else if (rightInd < rightLength) {
                result[i] = rightArr[rightInd++];
            } else {
                result[i] = leftArr[leftInd++];
            }
        }
//        System.out.println("result of method merge" + Arrays.toString(result));
        return result;
    }
}
