package academy.programming;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalsComparison {
        private static final int DECIMAL_PLACES = 3;
        // if two decimal numbers how are considered equal when rounded
        private static final RoundingMode MODE_ROUNDED = RoundingMode.HALF_UP;
        // if two decimal numbers how are considered equal when cut to two decimal places
        private static final RoundingMode MODE_FLOOR = RoundingMode.FLOOR;

        public static boolean areEqualByThreeDecimalPlaces(double a,double b){
            System.out.println("the first value is " + a);
            System.out.println("the second value is " + b);
            BigDecimal first = BigDecimal.valueOf(a).setScale(DECIMAL_PLACES, MODE_ROUNDED);
            BigDecimal second = BigDecimal.valueOf(b).setScale(DECIMAL_PLACES, MODE_ROUNDED);

            return first.compareTo(second) == 0;
        }

        public static void main(String[] args) {
            System.out.println("Should return true if RoundMode set to HALF_UP, false when set to FLOOR");
            System.out.println(areEqualByThreeDecimalPlaces(1.1245, 1.1251));
            System.out.println();
            System.out.println("Should return true if RoundMode set to HALF_UP, false when set to FLOOR");
            System.out.println(areEqualByThreeDecimalPlaces(1.1244, 1.1251));
            System.out.println();
            System.out.println("Should return false if RoundMode set to HALF_UP, true when set to FLOOR");
            System.out.println(areEqualByThreeDecimalPlaces(1.123456, 1.123567));
            System.out.println();

        }

    }

