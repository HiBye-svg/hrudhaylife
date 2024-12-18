import java.util.Scanner;
/**
 * Helper class to run code, to run life project
 */
public class LifeRunner {
    /**
     * main method for this project
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person player = new Person();
        System.out.print("Hello to HrudhayLife! Before entering the game, may");
        System.out.println(" I ask for your name?");
        String name = input.nextLine();
        player.setName(name);
        
        player.liveALife();
    }
}