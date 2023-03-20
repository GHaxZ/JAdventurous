import java.util.ArrayList;

public class Game {
    private static Level homeLevel = new Level("home", new String[]{}, new String[]{});
    private static Level level1 = new Level("level1", new String[]{}, new String[]{});
    private static Player player = new Player(nameSetUp(), 10, 5, homeLevel);
    private static Enemy zombie = new Enemy("Zombie", 0.5, new String[]{}, 30);
    private static Enemy skeleton = new Enemy("Skeleton", 1, new String[]{}, 25);

    public static void main(String args[]){
        mainConsole();
    }


    public static String nameSetUp(){
        String name = null;
        System.out.print("Welcome to the world of JAdventurous! To get started, please tell me your name: ");

        while(name == null){
            String nameInput = InputHandler.inputString();

            if(nameInput.length() <= 10){
                name = nameInput;
            } else {
                System.out.print(nameInput + " is too long of a username, maximum allowed length is 10 characters. \nPlease enter again: ");
            }
        }
        return name;
    }

    public static void mainConsole(){
        while(true){
            System.out.println("\nAvailable actions: walk, items, stats, info");
            String actionInput = InputHandler.inputString();

            switch(actionInput.toLowerCase()){
                case "walk":
                    boolean validInput = false;

                    while(!validInput){
                        System.out.println("Available locations to walk to: level1");
                        String levelInput = InputHandler.inputString();

                        switch(levelInput.toLowerCase()){
                            case "level1":
                                validInput = true;
                                levelConsole(level1);
                                break;
                            default:
                                System.out.println("\"" + levelInput + "\" is not a valid level.");
                        }
                    }
                    break;
                case "items":
                    System.out.println("Your items:\n");
                    ArrayList items = player.getItems();

                    System.out.println("Usable items:\n" + player.getHealPotions() + "x Heal Potion\n");

                    System.out.println("Equipment:");

                    for(int x = 0; x < items.size(); x++){
                        System.out.println(items.get(x));
                    }

                    break;
                case "stats":
                    System.out.println("Your stats:");
                    break;
                case "info":

                    System.out.println(player.getName() + " your stats are as followed:");
                    System.out.println("You currently have " + player.getHealth() + "hp out of " + player.getMaxHealth() + "hp");
                    player.healthVisualization();
                    System.out.println("Your are currently on level " + player.getCurrentLevel()); // player.getCurrentLevel will maybe be removed for the futur cuz I don´t know what the variable is supposed to present
                    break;
                default:
                    System.out.println("\"" + actionInput + "\" is not a valid action.");
            }
        }
    }

    public static void levelConsole(Level level){
        player.setCurrentLevel(level);
        System.out.println("You just entered " + level.getName() + ((level.getFirstTime() == true) ? " for the first time" : "") + ".");
        level.setFirstTime();
    }
}
