package speed.converter;
import java.math.RoundingMode;
import java.util.*;
import java.math.BigDecimal;

public class SpeedConverter {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //toMilesPerHour(5442);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            //System.out.println("invalid value");
            return -1;
        }
        //long milesPerHour = Math.round(kilometersPerHour/1.609);
        return Math.round(kilometersPerHour / 1.609);
    }

    /**
     * 1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
     *
     * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
     *
     * Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
     *
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }

    }

    /**
     * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
     *
     * The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
     *
     * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
     *
     * XX represents the original value kiloBytes.
     * YY represents the calculated megabytes.
     * ZZ represents the calculated remaining kilobytes.
     *
     * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"
     *
     * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
     *
     * @param kiloBytes
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int calculateMegabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + calculateMegabytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    /**
     * Write a method shouldWakeUp that has 2 parameters.
     *
     * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking. 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
     *
     * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
     *
     * In all other cases return false.
     *
     * If the hourOfDay parameter is less than 0 or greater than 23 return false.
     *
     * @param barking
     * @param hourOfDay
     * @return
     */

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22) {
            if(barking){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    /**
     * Write a method isLeapYear with a parameter of type int named year.
     *
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     *
     * If the parameter is not in that range return false.
     *
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
     *
     *
     * To determine whether a year is a leap year, follow these steps:
     * 1. If the year is evenly divisible by 4, go to step
     * 2. Otherwise, go to step 5.2. If the year is evenly divisible by 100, go to step
     * 3. Otherwise, go to step 4.3. If the year is evenly divisible by 400, go to step
     * 4. Otherwise, go to step 5.4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
     * 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
     *
     * The following years are not leap years:
     * 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
     * This is because they are evenly divisible by 100 but not by 400.
     *
     * The following years are leap years:
     * 1600, 2000, 2400
     * This is because they are evenly divisible by both 100 and 400.
     *
     * @param year
     */

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true; // if both condition are true --> true
                    } else {
                        return false;
                    }
                } else { // even if year % 100 != 0 still return true
                    return true;
                }
            } else {
                return false; // year % 4 != 0 should return false
            }
        } else {
            return false;
        }
    }

    /**
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
     *
     * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
     * Otherwise, return false.
     * @param a
     * @param b
     * @return
     *
     */


    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        BigDecimal da = BigDecimal.valueOf(a).setScale(3, RoundingMode.DOWN);
        BigDecimal db = BigDecimal.valueOf(b).setScale(3, RoundingMode.DOWN);
        return da.equals(db);
    }

    /**
     * Write a method hasEqualSum with 3 parameters of type int.
     *
     * The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter.
     * Otherwise, return false.
     */
    public static boolean hasEqualSum(int x, int y, int z){
        int sum = x + y;
        if (sum == z){
            return true;
        } else {
            return false;
        }
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     *
     * Write a method named hasTeen with 3 parameters of type int.
     *
     * The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
     * Otherwise return false.
     */

    public static boolean hasTeen(int s, int q, int l){
        if((s >= 13 && s <= 19) || (q >= 13 && q <= 19) || (l >= 13 && l <= 19)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int w){
        if(w >= 13 && w <= 19){
            return true;
        } else {
            return false;
        }
    }
}
