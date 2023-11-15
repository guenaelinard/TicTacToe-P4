import players.Player;

import java.util.Scanner;

public class Game {
    Board plateau = new Board();
    Player joueur = new Player("X");

    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String caseNum = scanner.next();
        return caseNum;
    }

    public void runGame(Scanner scanner) {
        //GROS IF LA ? REJOUE SANS SWITCHER SI CASE DEJA PRISE
            interaction(joueur, plateau, chooseCase(scanner));
        while (plateau.isntBoardFull() && !plateau.hasWon(joueur)) {
            // OU LA?
            interaction(switchTurn(joueur), plateau, chooseCase(scanner));
        }
    }

    public Player switchTurn(Player perso) {
        if (perso.getAttribute().equals("X")) {
            perso.setAttribute("O");
        } else {
            perso.setAttribute("X");
        }
        return perso;
    }

    public void interaction(Player player, Board board, String caseNum) {
        board.caseTick(player, caseNum);
    }



}



