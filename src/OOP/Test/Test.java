package OOP.Test;

public class Test {

    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Steven";
        player.health = 200;
        player.weapon = "sword";

        int damage = 50;
        player.loseHeath(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 190;
        player.loseHeath(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
