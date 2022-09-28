package digit.numbers;

/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 *
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 *
 * The method should calculate the largest prime factor of a given number and return it.
 */
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }
    /**
     * another shortcuts
     *
     * public void getLargestPrime(){
     *     assertEquals(2, HelloWords.getLargestPrime(2);
     *     assertEquals(3, HelloWords.getLargestPrime(6);
     *     assertEquals(5, HelloWords.getLargestPrime(15);
     * }
     */

}
