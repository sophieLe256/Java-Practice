package digit.numbers;

/**
 * Write a method named hasSameLastDigit with three parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
 * If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if at least two of the numbers share the same rightmost digit;
 * otherwise, it should return false.
 */
public class LasDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(11, 22, 31));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println();
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000 && c >= 10 && c <= 1000){
            if(a%10 == b%10 || b%10 == c%10 || a%10 == c%10){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int x){
        if(x >= 10 && x <= 1000){
            return true;
        } else {
            return false;
        }
    }
}
