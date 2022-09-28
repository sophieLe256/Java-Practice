package digit.numbers;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 *
 * The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.
 *
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));


    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        // finding the lastDigit first
        int lastDigit = number % 10;
        //System.out.println("Last digit = " + lastDigit);
        // initialized the firstDigit variable to the lastDigit so if the number less than 10, it is assigned the same value
        int firstDigit = lastDigit;
        while (number != 0) {
            //removes the last digit on the number
            //ex: 121/10 == 12 -> 12/10 == 1
            number /= 10;
            if (number % 10 == 0) {
                //assign the first digit of the number to firstDigit variable once there is
                //a single digit left. When a single digit is left ( 1 - 9 ) the conditional
                //statement number / 10 == 0 will evaluate to true since any digit 1-9 divided by
                //10 will return less than one, and an int value will return 0.
                //ex: 1/10==0, 2/10==0, ...., 9/10==0
                break;
            }
            firstDigit = number;

        }
        //System.out.println("first digit = " + firstDigit);
        sum = lastDigit + firstDigit;
        return sum;
    }
}
