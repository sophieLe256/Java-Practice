package OOP.Friend;

public class Friend {

    String name;
    static int numberOffFriend;
    Friend(String name){
        this.name = name;
        numberOffFriend++;
    }

    static void displayFriend(){
        System.out.println("You have " + numberOffFriend + " friends");
    }
}
