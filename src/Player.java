import java.util.*;
/**

 Represents a Player in the game.
 */
public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int damage;
    private int healPotions;
    private Level currentLevel;
    private ArrayList<String> items;

    /**
     Constructs a new Player object.
     @param name the name of the player
     @param maxHealth the maximum health of the player
     @param damage the damage the player can deal
     @param currentLevel the level the player is currently on
     */
    public Player(String name, int maxHealth, int damage, Level currentLevel){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
        this.currentLevel = currentLevel;
        healPotions = 1;
        items = new ArrayList<String>(Arrays.asList("Wooden sword"));
    }

    /**
     Sets the current level of the player.
     @param level the new level of the player
     */
    public void setCurrentLevel(Level level){
        currentLevel = level;
    }

    /**
     Gets the current level of the player.
     @return the current level of the player
     */
    public Level getCurrentLevel(){
        return currentLevel;
    }

    /**
     Adds an item to the player's inventory.
     @param item the item to add to the player's inventory
     */
    public void addItem(String item){
        if(item.equals("healPotion")){
            healPotions++;
        } else {
            items.add(item);
        }
    }

    /**
     Gets the list of items in the player's inventory.
     @return the list of items in the player's inventory
     */
    public ArrayList<String> getItems(){
        return items;
    }

    /**
     Gets the number of healing potions the player has.
     @return the number of healing potions the player has
     */
    public int getHealPotions(){
        return healPotions;
    }

    /**
     Gets the name of the player.
     @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     Gets the health of the player.
     @return the health of the player
     */
    public int getHealth() {
        return health;
    }

    /**
     Gets the maximum health of the player.
     @return the maximum health of the player
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     Gets the damage the player can deal.
     @return the damage the player can deal
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Visualizes the maxHealth & health of the player
     */

    public void healthVisualization() {
        int uAmount =(int) (Math.round((2.6*maxHealth+2))); //defines how many lines should be printed out above/under the hearts
        for(int i = 0; i<uAmount; i++) { //prints the lines above the hearts
            if(i == 0) {
                System.out.print("⌜");
            } else if (i == uAmount-1) {
                System.out.print("⌝");
            } else {
                System.out.print("⎽");
            }
        }
        System.out.println();
        for(int i = 0; i<maxHealth+2; i++) { //Prints the empty/full-hearts
            if(i == 0 || i == maxHealth+1) {
                System.out.print("⎥");
            } else if (i <= health) {
                System.out.print("♥");
            } else {
                System.out.print("♡");
            }
        }
        System.out.println();

        for(int i = 0; i<uAmount; i++) { //prints the lines under the hearts
            if(i == 0) {
                System.out.print("⌞");
            } else if (i == uAmount-1) {
                System.out.print("⌟");
            } else {
                System.out.print("⎺");
            }
        }
        System.out.println();
    }

}