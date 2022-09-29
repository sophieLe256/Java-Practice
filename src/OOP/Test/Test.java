package OOP.Test;

public class Test {

    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.fullName = "Steven";
//        player.health = 200;
//        player.weapon = "Sword";
//
//        int damage = 50;
//        player.loseHeath(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 190;
//        player.health = 300;
//        player.loseHeath(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Steven", 200, "Dagger");
        System.out.println("Initial health is " + player1.getHitPoints());
    }
}
