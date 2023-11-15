import players.Player;
import players.PlayerHuman;
import players.PlayerBot;

import java.util.Scanner;

public class Game {
    Board plateau = new Board();
    Player joueurUn = new Player("X");
    Player joueurDeux = new Player("O");


    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String caseNum = scanner.next();
        return caseNum;
    }

    public void runGame(Scanner scanner) {

        while (plateau.isntBoardFull() && !plateau.hasWon(joueurUn) && !plateau.hasWon(joueurDeux)) {
        interaction(joueurUn, plateau, chooseCase(scanner));
        interaction(joueurDeux, plateau, chooseCase(scanner));
    }
    }

    public void interaction(Player player, Board board, String caseNum) {
            board.caseTick(player, caseNum);
        }
    }



