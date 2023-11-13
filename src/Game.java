import java.util.Scanner;

public class Game {
    private Board board = new Board();
    private PlayerOne playerOne = new PlayerOne();
    private PlayerTwo playerTwo = new PlayerTwo();

    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String choice = scanner.next();
        return choice;
    }

}
