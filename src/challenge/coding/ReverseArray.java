package challenge.coding;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};

        //Arrays.toString: returns a string representation of an array
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse array = " + Arrays.toString(array));

    }

    public static void reverse(int[] array){
        // find the max value
        int maxIndex = array.length-1;

        // create the value halfLength
        // do the swapping until get to the halfway point of the array.
        int halfLength = array.length / 2;


        for(int i =  0; i < halfLength; i++){

            int temp = array[i];
            //first index swap to the last index
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }


}
