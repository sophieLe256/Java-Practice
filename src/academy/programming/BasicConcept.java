package academy.programming;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class BasicConcept {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args) {

//        Scanner scanner = new Scanner(System.in);


//        int value = 10000;
//        int myMinIntValue = Integer.MIN_VALUE; //large range
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value = " + myMinIntValue);
//        System.out.println("Integer MaximumValue = " + myMaxIntValue);
//        System.out.println("Busted MAX value = " + myMaxIntValue + 1);
//
//        byte myMinByteValue = Byte.MIN_VALUE;// for small range
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Minimum Value = " + myMinByteValue);
//        System.out.println("Byte Minimum Value = " + myMaxByteValue);
//
//
//
//        short myMinShortValue = Short.MIN_VALUE;// for small range
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Minimum Value = " + myMinShortValue);
//        System.out.println("Short Minimum Value = " + myMaxShortValue);
//
//        long myLongValue = 1000000L;
//        long myMinLongValue = Long.MIN_VALUE;// for small range
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Minimum Value = " + myMinLongValue);
//        System.out.println("Long Minimum Value = " + myMaxLongValue);
//
//        //Casting means to treat or convert a number from one type to another.
//        // We put the type we want the number tobe in parentheses like this:
//        //(byte)(minMinValue/2)
//
//        int myTotal = (myMinIntValue / 2);
//        byte myNewByteValue = (byte)(myMinByteValue/2);
//        System.out.println(myNewByteValue);
//
//        byte byteNumber = 10;
//        short shortNumber = 5;
//        int intNumber = 265454;
//        long DoubleTotal = 50000L + 10L * (intNumber + byteNumber + shortNumber);
//        System.out.println(DoubleTotal);
//
//
//
//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float Minimum Value = " + myMinFloatValue);
//        System.out.println("Float Minimum Value = " + myMaxFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double Minimum Value = " + myMinDoubleValue);
//        System.out.println("Double Minimum Value = " + myMaxDoubleValue);
//
//        int myIntValue = 5;
//        float myFloatValue = 5.58f;
//        double myDoubleValue = 5.464d;
//
//        int bankAccount = 10000;
//        double interestPerYear = 0.6 * 10000;
//        System.out.println(interestPerYear);
//
//        double interestPerMonth = 0.5 * 1000;
//        System.out.println(interestPerMonth);
//        int withdrawn = 500;
//
//        //Math
//        double a = in.nextDouble();
//        double b = in.nextDouble();
//        double c = in.nextDouble();
//
//        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
//        System.out.println(x1);
//
//
        //how to create a new array
//        int[] arr;
//        arr = new int[3];
//        arr[0] = 5;
//        arr[1] = 2;
//        arr[2] = 1;
//        System.out.println(a);
//        //Using for loop to print every elements in java
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//            //[I@e9e54c2
//            //5
//            //2
//            //1
//        }
//        //Có thể in ra toàn bộ giá trị bằng cách print trực tiếp mảng
//        char[] crr = {'H', 'o', 'w', 'K', 't', 'e', 'a', 'm'};
//        System.out.println(crr); //HowKteam
//
//        //Mảng đa chiều
//        /**
//         * Cú pháp khai báo:
//         * <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu> [kích cỡ hàng][kích cỡ cột];
//         *
//         * Cú pháp khởi tạo cho mảng:
//         * <kiểu dữ liệu> [][] <tên mảng> = {{các giá trị hảng 1}, {các giá trị hàng 2},... {các giá trị hàng n}}
//         */
//        // Example:
//        int[][] maxtric = {{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < 3; i++){
//            for(int j = 0; j< 3; j++) {
//                System.out.print(maxtric[i][j] + " ");
//            }
//            System.out.println();
//            }
//        }
//        // 1 2 3
//        // 4 5 6
//        // 7 8 9
//
//
        // Java program to demonstrate
        // setScale() method of BigDecimal
//
//
//
//    public class GFG {
//        public static void main(String[] args)
//        {
//            // BigDecimal object to store the result
//            BigDecimal res;
//
//            // For user input
//            // Use Scanner or BufferedReader
//
//            // Object of String created
//            // Holds the value
//            String input1 = "31452678569.25";
//
//            // Convert the string input to BigDecimal
//            BigDecimal a = new BigDecimal(input1);
//
//            // Scale for BigDecimal
//            int newScale = 4;
//
//            // Using setScale() method
//            res = a.setScale(newScale);
//
//            // Display the result in BigDecimal
//            System.out.println(res);
//        }
//    }

        // Enum Constant Summary (for RoundingMode method)
//
//    /**
//     * CELLING: Rounding mode to round towards positive infinity.
//     *
//     * DOWN: Rounding mode to round towards zero.
//     *
//     * FLOOR: Rounding mode to round towards negative infinity.
//     *
//     * HALF_DOWN: Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
//     *
//     * HALF_EVEN: Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant, in which case, round towards the even neighbor.
//     *
//     * HALF_UP: Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
//     *
//     * UNNECESSARY: Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary.
//     *
//     * UP: Rounding mode to round away from zero.
//     *
//     */
//
//
//    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
//
//        BigDecimal da = BigDecimal.valueOf(a).setScale(3, RoundingMode.DOWN);
//        BigDecimal db = BigDecimal.valueOf(b).setScale(3, RoundingMode.DOWN);
//        return da.equals(db); //Using equals to compare or compareTo instead of using if else statement
//    }


        //Array
//        myIntArray[5] = 50; // contains the elements from array[0] to array[49]
//        int[] myIntArray = {1,2,3,3,5,5,6,7,7,20};

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

        //Using for loop to display the elements of an array
//        int[] myIntArray = new int[100];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//            System.out.println(i);
//        }
//        printArray(myIntArray);
//    }
//
//        public static void printArray(int[] array){
//            for(int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }

//        int[] myIntegers = getIntegers(5);
//        for(int i = 0; i < myIntegers.length; i++){
//            System.out.println("Element " + i + ", typed of value was " + myIntegers[i]);
//        }
//        System.out.println("Average is " + getAverage(myIntegers));
//
//    }
//
//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for(int i= 0; i< values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    public static double getAverage(int[] array){
//        double sum = 0;
//        for(int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//
//        return sum/ array.length;
//    }

//        /**
//         * Array
//         *
//         * An array is a data structure that allows you to store multiple values of the same type into a single variable
//         * The default values of numeric array elements are set to zero
//         *
//         * Arrays are zero indexed: an array with n elements is indexed from 0 to n-1
//         *
//         * If we try to access index that is out of range Java will give us an ArrayIndexOutOfBoundsException, which indicates that the index is out of range in other words out of bounds
//         *
//         * To access array elements we use the square braces [and], also known as array access operator.
//         *
//         * the new operator or keyword is used to create the array and initialize the array elements to their default values.
//         *
//         * For boolean array elements they would be initialized to false
//         *
//         * For String or other objects that would be null
//         *
//         */
//

//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//
//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue );
//
//        anotherIntValue++;
//
//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("anotherIntValue = " + anotherIntValue );
//
//        //assigned both variable are referencing the same array in memory
//        int[] myIntArray = new int[5];
//        int[] anotherArray = myIntArray;
//
//        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //[0,0,0,0,0]
//        System.out.println("anotherIntArray = " + Arrays.toString(anotherArray));//[0,0,0,0,0]
//
//        anotherArray[0] = 1;
//
//
//        //Preference Types Array
//        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));//[1,0,0,0,0]
//        System.out.println("after change anotherIntArray = " + Arrays.toString(anotherArray));//[1,0,0,0,0]
//
//        anotherArray = new int[] {4,5,6,7,8};
//        modifyArray(myIntArray);
//
//        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));//[2,0,0,0,0]
////        System.out.println("after modify anotherIntArray = " + Arrays.toString(anotherArray));//[2,0,0,0,0]
//
//
//    }
//
//    private static void modifyArray(int[] array){
//        array[0] = 2;
//
//        // before calling the method modify array
//        // de-referencing another array reference
//        array = new int[] {1,2,3,4,5};
//    }

        System.out.println(Math.floor(2.1));

    }

}
