package OOP.UdemyAnimal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1, 5,5);
        Dog dog = new Dog("Tofu",40,70, 2, 4, 1, 20, "long silky");
        dog.eat();
        //System.out.println(dog);
        dog.walk();
        //dog.run();
    }
}
