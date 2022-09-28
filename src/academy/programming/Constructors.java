package academy.programming;

/**
 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.
 */

public class Constructors {
    // Create a Main class
        int x;  // Create a class attribute

        // Create a class constructor for the Main class
        public Constructors() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            Constructors myObj = new Constructors(); // Create an object of class Main (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
    }

// Outputs 5

