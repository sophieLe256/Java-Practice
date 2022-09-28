package challenge.coding;

// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(9000));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));


        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;

            default:
                System.out.println("Was not found");
                break;
        }
    }

    /**
     * Write a method called printNumberInWord. The method has one parameter number which is the whole number.
     * The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
     * You can use if-else statement or switch statement whatever is easier for you.
     * <p>
     * <p>
     * NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
     *
     * @param x
     */
    public static void printNumberInWorld(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

    /**
     * Write a method isLeapYear with a parameter of type int named year.
     * <p>
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
     * <p>
     * If the parameter is not in that range return false.
     * <p>
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
     * <p>
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     */

    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            return false;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            } else {
                return false;
            }
        }
    }
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        } else{
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                        return 29;
                    } else {
                        return 28;
                    }
            }
        }
        return getDaysInMonth(month, year);
    }
}
