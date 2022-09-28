package academy.programming;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PracticeSimpCoding {
    public static void main(String[] args) {
//        Random random = new Random();
//
//        //int x = random.nextInt(6) + 1; //random number between 1 and 6
//        double y = random.nextDouble(); // random number between 0 and 1
//        boolean z = random.nextBoolean();// random between true and false
//
//        //System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//        String nickName= "";

//        while(name.isBlank()){
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello "+name);

        //  do-while loop
//        do{
//            System.out.println("Enter your nickname: ");
//            nickName = scanner.nextLine();
//        } while (nickName.isBlank());
//
//        System.out.println("Hello "+nickName);

        //  for loop
//        for(int i=10; i >=0; i--){
//            System.out.println(i);
//        }
//        System.out.println("Happy new year");

        //  nested loop = a loop inside of a loop
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.print("Enter # of rows: ");
//        rows = scanner.nextInt();
//        System.out.print("Enter # of columns: ");
//        columns = scanner.nextInt();
//        System.out.print("Enter symbol to use: ");
//        symbol = scanner.next(); //next will on next tokens that we type until we hit space or enter
//
//        for(int i = 1; i <= rows; i++){
//            System.out.println();
//                for (int j = 1; j <= columns; j++){
//                    System.out.print(symbol); // print the symbol
//            }
//
//        }


        // array = used to store multiple values in a single variables
//        String[] cars = new String[3];
//        cars[0] = "Camaro";
//        cars[1] = "Convette";
//        cars[2] = "Tesla";
//
//        System.out.println(cars[2]); //display the variable that we want

        //display all the variables in array
//        for(int i = 0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }

        // 2D array = an array of arrays
        //String[][] cars = new String[3][3];
//        String[][] cars =   {
//                                {"A", "B", "C"},
//                                {"D", "E", "F"},
//                                {"G", "H", "I"}
//                            };

        //Pretty much same as upon method
//        cars[0][0] ="A";
//        cars[0][1] ="B";
//        cars[0][2] ="C";
//        cars[1][0] ="D";
//        cars[1][1] ="E";
//        cars[1][2] ="F";
//        cars[2][0] ="G";
//        cars[2][1] ="H";
//        cars[2][2] ="I";

//        for(int i=0; i < cars.length; i++){
//            System.out.println();
//            for(int j=0; j < cars[i].length; j++){
//                System.out.println(cars[i][j] + " ");
//            }
//        }


        //String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

//        String name = "Dino";

//        boolean result = name.equals("dino");
//        boolean result = name.equalsIgnoreCase("dino");
//
//        System.out.println(result);
//        System.out.println(result);

//        int result = name.length(); //cal # of chars w index
//        int result = name.charAt(0);
//        int result = name.indexOf("D");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
//        String result = name.replace("D", "P");

//        System.out.println(result);

        //wrapper class = provides a way to use primitive data types as reference data types
        //                reference data types contain useful methods
        //                can be used with collections (ex.ArrayList)

        //primitive     //wrapper
        //--------      //--------
        //boolean       Boolean
        //char          Character
        //int           Integer

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

//        Boolean a = true;
//        Character b = '@';
//        Integer c = 123;
//        Double d = 3.14;
//        String e = "Bro";
//
//        if(a==true){
//            System.out.println("This is true");
//        }

        //ArrayList = a resizable array
        //            Elements can be added and removed after compilation phase
        //            store reference data types

//        ArrayList<String> food= new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hotdog");
//        food.add("hamburger");
//
//        food.set(0,"sushi");
//        food.remove(2);
//        //food.clear();
//
//        for(int i=0; i<food.size(); i++){
//            System.out.println(food.get(i));
//        }
        //2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime
//        ArrayList<ArrayList<String>> groceryList = new ArrayList();
//
//        ArrayList<String> bakeryList = new ArrayList();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donut");
//        System.out.println(bakeryList.get(0));
//
//        ArrayList<String> produceList = new ArrayList();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//        ArrayList<String> drinkList = new ArrayList<>();
//        drinkList.add("soda");
//        drinkList.add("coffee");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinkList);
//
//        System.out.println(groceryList.get(0).get(0));

        //for-each = traversing technique to iterate through the elements in an array/collection
        //           less steps, more readable
        //           less flexible

        //String[] animals = {"cat", "dog", "rat", "bird"};
//        ArrayList<String> animals = new ArrayList<String>();
//
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");
//
//
//        // each index for the array animals
//        for(String i : animals){
//            System.out.println(i); // results gonna be the same if we are using the String[] or the ArrayList
//        }


        //method = a block of code that is executed whenever it is called upon
//            hello(); // can't pass any variables or value to the method because they can be confused what is actual one.
        // has to be called the method in public static main
//    }
//        static void hello() {
//            System.out.println("Hello");
//        }


//        String name = "Bro";
//        hello(name, age); //if we want to pass any differences value or variables into the method
//    }
//
//    // hello method can access into the String variables of name
//    static void hello(String name, int age){
//        System.out.println("Hello" + name);
//        System.out.println("You are "+ age);
//    }

//        int x = 3;
//        int y = 4;
//
//        System.out.println(add(x,y));
//    }
//    static int add(int x, int y){
//
//        int z = x + y;
//        return z;
//    }

        //overload method = methods that share the same name but have different parameters
        //                  method name + parameters = method signature

//        int x = add(1, 2, 4, 8);
//        double y = add(3.5,35.6,456.3);
//
//        System.out.println(x);
//        System.out.println(y);
//
//    }
//    static int add(int a, int b){
//        System.out.println("This is overload method #1");
//        return a + b;
//    }
//    static int add(int a, int b, int c){
//        System.out.println("This is overload method #2");
//        return a + b + c;
//    }
//
//    static int add(int a, int b, int c, int d){
//        System.out.println("This is overload method #3");
//        return a + b + c + d;
//    }
//    static double add(double a, double b){
//        System.out.println("This is overload method #4");
//        return a + b;
//    }
//    static double add(double a, double b, double c){
//        System.out.println("This is overload method #5");
//        return a + b + c;
//    }
//
//    static double add(double a, double b, double c, double d){
//        System.out.println("This is overload method #6");
//        return a + b + c + d;
//    }

        //printf() = an option method to control, format, and display text to the console window
        //           two arguments = format string + (object/variable/value)
        //           % [flag] [precision] [width] [conversion-character]

//        boolean myBoolean = true;
//        char myChar = '@';
//        String myString = "Bro";
//        int myInt = 50;
//        double myDouble = 1000;
//
//        //[conversion-character]
//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);
//
//        //[width]
//        //minimum number of characters to be written as output
//        System.out.printf("Hello %s", myString);
//        System.out.println();
//        System.out.printf("You have this much money %10s", myString); // empty spaces
//        System.out.println();
//        System.out.printf("You have this much money %-10s", myString); // counting spaces backward
//
//
//        //[precision]
//        // sets number of digits of precision when outputting floating-point values
//        System.out.printf("%nYou have this much money %f", myDouble);
//        System.out.printf("%nYou have this much money %.2f", myDouble); // limited the amount of digits
//
//        // [flags]
//        // adds an effect to output based on the flag added to format specifier
//        // - : left-justify
//        // + : output a plus (+) or minus (-) sign for a numeric value
//        // 0 : numeric values are zero-padded
//        // , : comma grouping separator if numbers > 1000
//
//        System.out.printf("%nYou have this much money %20f", myDouble);
//        System.out.printf("%nYou have this much money %+f", myDouble);
//        System.out.printf("%nYou have this much money %,.2f", myDouble);

//        final double PI = 3.14; // once it declared, it can not be updated

        //OOP = Object-Oriented Programming
        //object = an instance of a class that may contain attributes and methods
        //example: (phone, desk, computer, coffee up)







    }

}
