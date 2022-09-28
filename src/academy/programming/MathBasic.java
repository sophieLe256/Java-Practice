package academy.programming;
import java.util.Scanner;

public class MathBasic {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 10;

        double z = Math.max(x, y);
        double t = Math.min(x, y);
        double r = Math.round(x);
        double p = Math.abs(x);
        double f = Math.floor(x);

        System.out.println(z);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a :");
        a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        b =  scanner.nextDouble();

        c = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }
}
