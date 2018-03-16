package beginner;

import java.util.Random;

public class SearchMinMax {
    public static void main(String[] args){
        int[] array = createArray(20);
        int min = array[0];
        int max = array[0];
        BubbleSort.printArray(array);
        System.out.println();

        for (int ar :array) {
            if (ar > max) max = ar;
            if (ar < min) min = ar;
        }
        System.out.println(" min = " + min+"; max = " + max);
    }

    private static int[] createArray(int dimension){
        int[] temp = new int[dimension];
        Random r = new Random();
        for(int i=0; i< temp.length; i++){
            temp[i] = r.nextInt(dimension);
        }
        return temp;
    }
}