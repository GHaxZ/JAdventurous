import java.lang.reflect.Array;
import java.util.*;

public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int damage;
    private int healPotions;
    private Level currentLevel;
    private ArrayList<String> items;

    public Player(String name, int maxHealth, int damage, Level currentLevel){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
        this.currentLevel = currentLevel;
        healPotions = 1;
        items = new ArrayList<String>(Arrays.asList("Wooden sword"));
    }

    public void setCurrentLevel(Level level){
        currentLevel = level;
    }

    public Level getCurrentLevel(){
        return currentLevel;
    }

    public void addItem(String item){
        if(item.equals("healPotion")){
            healPotions++;
        } else {
            items.add(item);
        }
    }

    public ArrayList getItems(){
        return items;
    }

    public int getHealPotions(){
        return healPotions;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getDamage() {
        return damage;
    }

    //Visualizes the maxHealth & health of the player
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

        for(int i = 0; i<uAmount; i++) { //prnts the lines under the hearts
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