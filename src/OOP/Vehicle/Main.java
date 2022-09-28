package OOP.Vehicle;

public class Main {
    public static void main(String[] args) {

        // inheritance = the process where one class acquires,
        //               the attributes and methods of another.

        Car car = new Car();
//
//    car.go();

        Bicycle bike = new Bicycle();

        System.out.println(bike.pedals);
        System.out.println(car.doors);

    }
}
