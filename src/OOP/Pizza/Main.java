package OOP.Pizza;

public class Main {
    public static void main(String[] args) {

        // overloaded constructors = multiple constructors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozarella", "peperroni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza pizza1 = new Pizza("thin crust", "potato", "chesedar");
        System.out.println(pizza1.topping);

    }
}
