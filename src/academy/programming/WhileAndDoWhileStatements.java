package academy.programming;

/**
 * do{
 *     //statement
 * } while (condition);
 */

public class WhileAndDoWhileStatements {
    public static void main(String[] args) {
        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        //For loop (similar)
        for (int i = 1; i < 7; i++) {
            System.out.println("Count value is " + i);
        }
        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }


        /**
         *
         // Create a method called isEvenNumber that takes a parameter of type int
         // Its purpose is to determine if the argument passed to the method is
         // an even number or not.
         // return true if an even number, otherwise return false;
         */
//        int number = 4;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            number++;
//           if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
//    }
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            //System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found " + evenNumbersFound);
    }

    /**
     *
     // Modify the while code above
     // Make it also record the total number of even numbers it has found
     // and break once 5 are found
     // and at the end, display the total number of even numbers found

     * @param number
     * @return
     */
        public static boolean isEvenNumber(int number){
            if((number % 2) == 0){
                return true;
            } else {
                return false;
            }
        }

}
