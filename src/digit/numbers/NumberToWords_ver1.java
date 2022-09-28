package digit.numbers;

/**
 * Write a method called numberToWords with one int parameter named number.
 *
 * The method should print out the passed number using words for the digits.
 *
 * If the number is negative, print "Invalid Value".
 *
 * To print the number as words, follow these steps:
 *
 * 1. Extract the last digit of the given number using the remainder operator.
 * 2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit,
 * those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit,
 * e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
 * 3. Remove the last digit from the number.
 * 4. Repeat Steps 2 through 4 until the number is 0.
 *
 * The logic above is correct, but in its current state, the words will be printed in reverse order.
 * For example, if the number is 234,
 * the logic above will produce the output "Four Three Two" instead of "Two Three Four".
 * To overcome this problem, write a second method called reverse.
 *
 * The method reverse should have one int parameter and return the reversed number (int).
 * For example, if the number passed is 234, then the reversed number would be 432.
 * The method  reverse should also reverse negative numbers.
 *
 * Use the method reverse within the method numberToWords in order to print the words in the correct order.
 *
 * Another thing to keep in mind is any reversed number with leading zeroes
 * (e.g. the reversed number for 100 is 001).
 * The logic above for the method numberToWords will print "One", but that is incorrect.
 * It should print "One Zero Zero". To solve this problem, write a third method called getDigitCount.
 *
 * The method getDigitCount should have one int parameter called number and
 * return the count of the digits in that number.
 * If the number is negative, return -1 to indicate an invalid value.
 * For example, if the number has a value of 100,
 * the method getDigitCount should return 3 since the number 100 has 3 digits (1, 0, 0).
 */
public class NumberToWords_ver1 {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(1000));
        System.out.println(numberToWords(-12));

        System.out.println();

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(12345));
        System.out.println(reverse(100));

        System.out.println();

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }
    public static int numberToWords(int number){
//        if (number < 0) {
//            return "Invalid Value";
//        }
//
//        int lastDigit = number % 10;
//        int firstDigit = lastDigit;
//
//        while (number != 0) {
//            number /= 10;
//            if (number % 10 == 0) {
//                break;
//            }
//            firstDigit = number;
//        }
        while (number != 0){
            int flag = number % 10;
        switch (flag) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            }
        number /= 10;
        }
        return -1;

    }
    public static int reverse(int num){
        int remainder;
        int newNum = 0;
        while (num != 0){
            remainder = num % 10;
            newNum += remainder;
            newNum *= 10;
            num /= 10;

        }
        newNum /= 10;
        System.out.println(newNum);
        return  newNum;

    }


    public static int getDigitCount(int number){
        int count = 0;

        for (int i = number; i > 0; i/=10){
            count++;
        }
        System.out.println(count);
        return count;
    }
}
