/**

 The Enemy class stores information about an enemy in the game.

 It has a name, health, damage, and items.
 */
public class Enemy {
    private String name;
    private int health;
    private double damage;
    private String[] items;

    /**
     Constructs a new Enemy object with a name, health, damage, and items.
     @param name the name of the enemy.
     @param damage the damage of the enemy.
     @param items an array of items the enemy drops.
     @param health the health of the enemy.
     */
    public Enemy(String name, double damage, String[] items, int health) {
        this.name = name;
        this.damage = damage;
        this.items = items;
        this.health = health;
    }
}

/**

 The Game class runs the main game loop and stores important game information.
 It has a home level, level 1, the player, a zombie enemy, and a skeleton enemy.
 */
