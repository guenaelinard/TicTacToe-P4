import players.Player;
import players.PlayerHuman;
import players.PlayerBot;

import java.util.Scanner;

public class Game {
//    private Board board = new Board();
//    private Player playerOne = new Player("X");
//    private Player playerTwo = new Player("O");


    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String caseNum = scanner.next();
        return caseNum;
    }
    public void interaction(Player player, Board board, String caseNum) {
        board.caseTick(player, caseNum);
        System.out.println(player);
    }


}
