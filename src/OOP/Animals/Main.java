package OOP.Animals;

public class Main {
    public static void main(String[] args) {

        // methods overriding = Declaring a method in subclass,
        //                      which is already present in parent class,
        //                      done so that a child class can give it own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
    }


}
