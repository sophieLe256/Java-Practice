package academy.programming;

import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class BasicConcept {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);


        int value = 10000;
        int myMinIntValue = Integer.MIN_VALUE; //large range
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer MaximumValue = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + myMaxIntValue + 1);

        byte myMinByteValue = Byte.MIN_VALUE;// for small range
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Minimum Value = " + myMaxByteValue);



        short myMinShortValue = Short.MIN_VALUE;// for small range
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Minimum Value = " + myMaxShortValue);

        long myLongValue = 1000000L;
        long myMinLongValue = Long.MIN_VALUE;// for small range
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);

        //Casting means to treat or convert a number from one type to another.
        // We put the type we want the number tobe in parentheses like this:
        //(byte)(minMinValue/2)

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);

        byte byteNumber = 10;
        short shortNumber = 5;
        int intNumber = 265454;
        long DoubleTotal = 50000L + 10L * (intNumber + byteNumber + shortNumber);
        System.out.println(DoubleTotal);



        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Minimum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Minimum Value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.58f;
        double myDoubleValue = 5.464d;

        int bankAccount = 10000;
        double interestPerYear = 0.6 * 10000;
        System.out.println(interestPerYear);

        double interestPerMonth = 0.5 * 1000;
        System.out.println(interestPerMonth);
        int withdrawn = 500;

        //Math
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(x1);


        //how to create a new array
        int[] arr;
        arr = new int[3];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 1;
        System.out.println(a);
        //Using for loop to print every elements in java
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            //[I@e9e54c2
            //5
            //2
            //1
        }
        //Có thể in ra toàn bộ giá trị bằng cách print trực tiếp mảng
        char[] crr = {'H', 'o', 'w', 'K', 't', 'e', 'a', 'm'};
        System.out.println(crr); //HowKteam

        //Mảng đa chiều
        /**
         * Cú pháp khai báo:
         * <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu> [kích cỡ hàng][kích cỡ cột];
         *
         * Cú pháp khởi tạo cho mảng:
         * <kiểu dữ liệu> [][] <tên mảng> = {{các giá trị hảng 1}, {các giá trị hàng 2},... {các giá trị hàng n}}
         */
        // Example:
        int[][] maxtric = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++) {
                System.out.print(maxtric[i][j] + " ");
            }
            System.out.println();
            }
        }
        // 1 2 3
        // 4 5 6
        // 7 8 9


// Java program to demonstrate
// setScale() method of BigDecimal



    public class GFG {
        public static void main(String[] args)
        {
            // BigDecimal object to store the result
            BigDecimal res;

            // For user input
            // Use Scanner or BufferedReader

            // Object of String created
            // Holds the value
            String input1 = "31452678569.25";

            // Convert the string input to BigDecimal
            BigDecimal a = new BigDecimal(input1);

            // Scale for BigDecimal
            int newScale = 4;

            // Using setScale() method
            res = a.setScale(newScale);

            // Display the result in BigDecimal
            System.out.println(res);
        }
    }

    // Enum Constant Summary (for RoundingMode method)

    /**
     * CELLING: Rounding mode to round towards positive infinity.
     *
     * DOWN: Rounding mode to round towards zero.
     *
     * FLOOR: Rounding mode to round towards negative infinity.
     *
     * HALF_DOWN: Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round down.
     *
     * HALF_EVEN: Rounding mode to round towards the "nearest neighbor" unless both neighbors are equidistant, in which case, round towards the even neighbor.
     *
     * HALF_UP: Rounding mode to round towards "nearest neighbor" unless both neighbors are equidistant, in which case round up.
     *
     * UNNECESSARY: Rounding mode to assert that the requested operation has an exact result, hence no rounding is necessary.
     *
     * UP: Rounding mode to round away from zero.
     *
     */


    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        BigDecimal da = BigDecimal.valueOf(a).setScale(3, RoundingMode.DOWN);
        BigDecimal db = BigDecimal.valueOf(b).setScale(3, RoundingMode.DOWN);
        return da.equals(db); //Using equals to compare or compareTo instead of using if else statement
    }

}
