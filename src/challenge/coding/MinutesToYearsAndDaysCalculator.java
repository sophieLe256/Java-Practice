package challenge.coding;

/**
 * Write a method printYearsAndDays with parameter of type long named minutes.
 *
 * The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
 *
 * If the parameter is less than 0, print text "Invalid Value".
 *
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 *
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 */
public class MinutesToYearsAndDaysCalculator {
    public static void main (String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-165412);
        printYearsAndDays(0);
        printYearsAndDays(1440);

    }
    /**
    public static String printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        long hours = minutes / 60;
        long remainingHours = minutes % 60;
        long days = hours / 24;
        long remainingDays = remainingHours % 24;
        long years = days / 365;
        return minutes + "min = " + years + " y and " + remainingDays + " d";

    }
     */

    //Another way
    /**
     *     /Defining the method/
     *     public  static void printYearsAndDays(long minutes){
     *
     *         /declaring variables for year days and minutes/
     *         long XX = minutes, YY, ZZ;
     *
     *         /invalid if it's less than 0/
     *         if(XX < 0 )
     *             System.out.println("Invalid Value");
     *         else
     *         {
     *             /calculating years/
     *             YY = XX / 60 / 24 / 365;
     *
     *             /calculating days/
     *             ZZ = (XX % (60 * 24 * 365)) / (60 * 24);
     *             System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
     *         }
     * @param minutes
     */
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long years = 0;
            long days = 0;

            if(minutes >= 525600) {
                years = minutes / 525600;
                days = (minutes % 525600) / 1440;
            } else {
                days = minutes / 1440;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }
    }

}
