package beginner;

public class BubbleSort {
    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        printArray(array);
        sortArray(array);
        System.out.println();
        printArray(array);
    }

    private static void sortArray(int[] array){
        int temp;
        int pos = array.length-1;
        while( pos > 0) {
            for (int i = 0; i < pos; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
            pos--;
        }
    }

    private static void printArray(int[] array){
        for (int ar: array) {
            System.out.print(ar + " ");
        }
    }

}
