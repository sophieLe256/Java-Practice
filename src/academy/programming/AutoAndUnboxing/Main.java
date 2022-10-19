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
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i<= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for(int i = 0; i<= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //intValur which os a value converts it back from Integer from the Integer class back into an int type to a primitive type
        }

    }
}
