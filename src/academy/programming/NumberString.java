package academy.programming;
import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {

        String numberAsString = "2018.56";
        System.out.println("numberAsString= " + numberAsString);

        //int number = Integer.parseInt(numberAsString);
        //System.out.println("number = " + number);
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
