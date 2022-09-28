package speed.converter;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);
        System.out.println("------");

        SpeedConverter.printConversion(10.5);
        System.out.println("------");

        SpeedConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println("------");

        System.out.println(SpeedConverter.shouldWakeUp(true, 1)); // true
        System.out.println(SpeedConverter.shouldWakeUp(false, 2)); // false
        System.out.println(SpeedConverter.shouldWakeUp(true, 8)); // false
        System.out.println(SpeedConverter.shouldWakeUp(true, -1)); // false

        System.out.println("------");
        System.out.println(SpeedConverter.isLeapYear(-1600)); // false
        System.out.println(SpeedConverter.isLeapYear(1600)); // true
        System.out.println(SpeedConverter.isLeapYear(2017)); // false
        System.out.println(SpeedConverter.isLeapYear(2000)); // true
        System.out.println(SpeedConverter.isLeapYear(1924)); // true

        System.out.println("------");
        System.out.println(SpeedConverter.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(SpeedConverter.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(SpeedConverter.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(SpeedConverter.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println("------");
        System.out.println(SpeedConverter.hasEqualSum(1, 1, 1));
        System.out.println(SpeedConverter.hasEqualSum(1, 1, 2));
        System.out.println(SpeedConverter.hasEqualSum(1, -1, 0));

        System.out.println("------");
        System.out.println(SpeedConverter.hasTeen(9, 99, 19));
        System.out.println(SpeedConverter.hasTeen(23, 15, 42));
        System.out.println(SpeedConverter.hasTeen(22, 23, 34));

        System.out.println("------");
        System.out.println(SpeedConverter.isTeen(9));
        System.out.println(SpeedConverter.isTeen(13));
        System.out.println(SpeedConverter.isTeen(19));




    }
}
