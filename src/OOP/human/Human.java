package OOP.human;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){

        //give them "this" name of this object (specify)
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating.");
    }

    void drink(){
        System.out.println(this.name + " is drinking.");
    }
}
