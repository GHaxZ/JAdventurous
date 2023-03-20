/**

 The Level class stores information about a level in the game.

 It has a name, items, and enemies.
 */
public class Level {
    private String name;
    private String[] items;
    private String[] enemies;
    private boolean firstTime = true;

    /**
     Constructs a new Level object with a name, items, and enemies.
     @param name the name of the level.
     @param items an array of items in the level.
     @param enemies an array of enemies in the level.
     */
    public Level(String name, String[] items, String[] enemies) {
        this.name = name;
        this.items = items;
        this.enemies = enemies;
    }

    /**
     Returns the name of the level.
     @return the name of the level.
     */
    public String getName(){
        return name;
    }

    /**
     Sets the firstTime boolean to false.
     */
    public void setFirstTime(){
        firstTime = false;
    }

    /**
     Returns the value of the firstTime boolean.
     @return the value of the firstTime boolean.
     */
    public boolean getFirstTime(){
        return firstTime;
    }
}