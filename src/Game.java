import players.Player;

import java.util.Scanner;

public class Game {
    Board plateau;
    Player joueur;

    public Game(Board plateau, Player joueur) {
        this.plateau = plateau;
        this.joueur = joueur;
    }

    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String caseNum = scanner.next();
        return caseNum;
    }

//    public String chooseAnotherCase(Scanner scanner) {
//        System.out.println("Choisis une case.");
//        String caseNum = scanner.next();
//        return caseNum;
//    }

    public void runGame(Scanner scanner) {

        interaction(joueur, plateau, chooseCase(scanner));

        while (plateau.isntBoardFull() && !plateau.hasWon(joueur)) {

//            if (!plateau.isPlayingAgainSameCase(chooseCase(scanner))) {

            interaction(switchTurn(joueur), plateau, chooseCase(scanner));

//            } else {
//
//                interaction(joueur, plateau, chooseCase(scanner));
//            }
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



