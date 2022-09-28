package academy.programming;
import java.math.BigDecimal;
import java.util.Scanner;
import speed.converter.SpeedConverter;

import javax.swing.event.ListDataListener;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //how to create a new array
        double c = 123.1235 - Math.floor(123.1235);
        System.out.println(new BigDecimal(c));
    }

        public static boolean areEqualByThreeDecimalPlaces(double a, double b){

            double da = a - Math.floor(a*1000);
            //a = a/1000;
            double db = b - Math.floor(b*1000);
            //b = b/1000;
            if(da == db){
                return true;
            } else {
                return false;
            }

    }


}