public class Enemy {
    private String name;
    private int health;
    private double damage;
    private String[] items;

    public Enemy(String name, double damage, String[] items, int health) {
        this.name = name;
        this.damage = damage;
        this.items = items;
        this.health = health;
    }
}
