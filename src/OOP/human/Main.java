package OOP.human;

public class Main {
    public static void main(String[] args) {
        //constructor = special method that is called when an object is instantiated (created)

        Human human = new Human("Dio", 35,110); // this give us the ability to create different object that has different attributes
        Human human2 = new Human("Sio", 37, 89);

        human.eat();
        human2.drink();

        System.out.println(human.name);
        System.out.println(human2.name);

        System.out.println();

    }
}
