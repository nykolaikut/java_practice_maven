package beginner;

public class SearchMinMax {
    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        int min = array[0];
        int max = array[0];

        for (int ar :array) {
            if (ar > max) max = ar;
            if (ar < min) min = ar;
        }
        System.out.println(" min = " + min+"; max = " + max);
    }
}
