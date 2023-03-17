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

}