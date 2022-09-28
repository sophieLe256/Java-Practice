package OOP.Friend;

public class Main {
    public static void main(String[] args) {

        //static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member

        Friend friend1 = new Friend("Patrick");
        Friend friend2 = new Friend("Steven");
        Friend friend3 = new Friend("Bob");

        //System.out.println(Friend.numberOffFriend);
        Friend.displayFriend();

    }
}
