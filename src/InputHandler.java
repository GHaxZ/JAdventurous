import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString(){
        String input = scanner.next();
        return input;
    }
}
