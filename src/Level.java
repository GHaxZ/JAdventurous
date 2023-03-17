public class Level {
    private String name;
    private String[] items;
    private String[] enemies;
    private boolean firstTime = true;

    public Level(String name, String[] items, String[] enemies) {
        this.name = name;
        this.items = items;
        this.enemies = enemies;
    }

    public String getName(){
        return name;
    }

    public void setFirstTime(){
        firstTime = false;
    }

    public boolean getFirstTime(){
        return firstTime;
    }

}
