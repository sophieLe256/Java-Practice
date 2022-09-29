package OOP.Test;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        } else {
            System.out.println("This player does not allow enter");
        }
        this.weapon = weapon;
    }
    public void loseHeath(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("The player is knocked out");
            // Reduce number of lives remaining for the player
        }

    }

    //Encapsulation which keep things confined
    // (protect the members of the class and some methods,from external class,
    // also prevent unauthorized set up or access)
    public int getHitPoints() {
        return hitPoints;
    }
}
