package challenge.coding;
import java.util.*;

public class PositiveNegativeZero {
    public static void main(String [] args){
    Scanner input = new Scanner (System.in);
    checkNumber(5);
    } public static void checkNumber(int number){
        if (number == 0){
            System.out.println("Zero");

        } else if (number < 0){
            System.out.println("Negative");

        } else {
            System.out.println("Positive");
        }
    }
}
