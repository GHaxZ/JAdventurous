import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private int damage;
    private Level currentLevel;
    private ArrayList<String> items;

    public Player(String name, int maxHealth, int damage, Level currentLevel){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
        this.currentLevel = currentLevel;
    }

    public List getItems(){
        return null;
    }

    public void setCurrentLevel(Level level){
        currentLevel = level;
    }

    public Level getCurrentLevel(){
        return currentLevel;
    }

}