package challenge.coding;
import java.util.Scanner;
//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//-Finally, print the minimum element in the array.
public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnArray = readIntegers(count);
        int returnedMin = findMin(returnArray);

        System.out.println("Min = " + returnedMin);

    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i < array.length;i++){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine(); // advances this scanner past the current line and return the input that was skipped
            array[i] = number;

        }
        return array;

    }

    private static int findMin(int[] array){
        //every number that user enters must be equal to maximum value can contain
        //another method is to set min become the first element and compare it to the others.
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;

    }

}
