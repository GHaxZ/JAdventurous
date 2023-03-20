/**

 The InputHandler class provides a way to handle user input from the console.
 */
import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Reads a string from the console and returns it.
     *
     * @return a string read from the console.
     */
    public static String inputString() {
        return scanner.next();
    }
}