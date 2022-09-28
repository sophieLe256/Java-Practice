package challenge.coding;

import java.math.BigInteger;

/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 *
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 *
 * The method should return the greatest common divisor of the two numbers (int).
 *
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 *
 *
 * For example 12 and 30:
 *
 * 12 can be divided by 1, 2, 3, 4, 6, 12
 *
 * 30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
 *
 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }


    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            return recursive(first, second);
        } else {
            return -1;
        }
    }

    public static int recursive(int first, int second) {
        if (first != 0 && second != 0) {
            if (first == second) {
                return first;
            } else if (first > second) {
                return recursive(first - second, second);
            } else {
                return recursive(second - first, first);
            }
        } else {
            return 0;
        }
    }
}


        /**
         if(first >= 10 || second >= 10){
         return first == 0 ? second : getGreaterCommonDivisor(second % first, first);
         }
         return -1;
         */

        /**
        if(first >= 10 || second >= 10) {
            BigInteger b1 = BigInteger.valueOf(first);
            BigInteger b2 = BigInteger.valueOf(second);
            BigInteger gcd = b1.gcd(b2);
            return gcd.intValue();
        }
        return -1;
         */

        /**

        int greatest = 0;

        if(first > 10 && second > 10){

        for(int i = 1; ((i <= first) && (i <= second)); i++){
            if((first % i == 0) && (second % i == 0)){
                greatest = i;
            }

        }
        System.out.println(greatest);
            return 1;
        } else {
            System.out.println("-1");
            return -1;
        }
         */

