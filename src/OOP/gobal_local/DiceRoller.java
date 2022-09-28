package OOP.gobal_local;

import java.util.Random;

public class DiceRoller {

    // Method 1: Pass these arguments to the method
//    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//    }
//
//    void roll (Random random, int number){
//        number = random.nextInt(6)+1; // +1 because nextInt(6) usually go through 1-5 therefore we have to plus 1.
//        System.out.println(number);
//    }

    // Method 2: Declare variables as a global

    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
