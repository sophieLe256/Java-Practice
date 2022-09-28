package challenge.coding;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */
public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(9, 9));

        //System.out.println(shareDigit(9, 9));
        //System.out.println(shareDigit(15, 15));


    }
 /**
  * it was wrong because hasSharedDigit(9, 9) turn out true
    public static boolean hasSharedDigit(int a, int b) {
        if (a <= 9 || a >= 99 || b <= 10 || b >= 99) {
            while (a != 0) {
                int check = a % 10;
                a /= 10;
                while (b != 0) {
                    if (b == check) {
                        return true;
                    }
                    b /= 10;
                }

            }
        }
        return false;
    }
 */

    public static boolean hasSharedDigit(int a, int b){
        if(a >= 10 && a <= 99 && b >= 10 && b <=99){
            if(a%10 == b/10 || a/10 == b%10 || a/10 == b/10 || a%10 == b%10){
                return true;
            } else {
                return false;
        }
            } else {
            return false;
        }
    }

}
