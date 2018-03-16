package beginner;

public class BinerySearch {

    public static void main(String[] args) {

        int[] array = createArray(25);
        BubbleSort.printArray(array);

        /* checking values */
        int[] checkArray = {array[0]-1,array[0],array[(array.length/2)],array[array.length-1],array[array.length-1]+1};
        System.out.print(" checking values ");
        BubbleSort.printArray(checkArray);

        int ind;
        for (int ar: checkArray) {
            ind = searcIndexArray(ar,array);
            if (ind < 0) {
                System.out.println(ar+" is not found into the array.");
            } else
                System.out.println("There is "+ar+" into the array.   ["+ind+"]");
        }
    }

    private static int searcIndexArray(int searchNumber, int[] array){
        int begin = 0;
        int mid;
        int end = array.length;

        while (true) {
            mid = (end + begin) / 2;
            if (searchNumber < array[mid]) {
                end = mid - 1;
            } else if (searchNumber > array[mid])
                begin = mid + 1;
            else
                return mid;

//            System.out.println("test " +begin + " " + mid + " " + end);

            if (begin >= end) return -1;
        }
    }

    private static int[] createArray(int dimension){
        int[] temp = new int[dimension];
        int pos = -dimension/2;
        for(int i= 0; i< temp.length; i++){
            temp[i] = pos++;
        }
        return temp;
    }

}