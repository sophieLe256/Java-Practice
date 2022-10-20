package academy.programming.AutoAndUnboxing;

import java.util.ArrayList;

/**
 * Create IntClass wrapper
 */
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();

        stringArrayList.add("Tim");

        //cannot do like this cuz type argument cannot be of primitive type
        //ArrayList<int> intArrayList = new ArrayList<int>();

        //in order to use Int or other type (not primitive type) in the arrayList
        // it need to be passed a class ot
        // add an object type IntClass with value 54
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i<= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i<= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //intValur which os a value converts it back from Integer from the Integer class back into an int type to a primitive type
        }

        //method boxing and unboxing
        Integer myIntValue = 56; //Integer.valueOf(56); (only integer)
        int myInt = myIntValue.intValue(); //myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0 ; dbl += 0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

    }
}
