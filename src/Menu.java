import players.Player;
import players.PlayerHuman;

import java.util.Scanner;

public class Menu {

    public Menu() {
        }

    public void beginGame(Scanner scanner) {
        System.out.println("Tu veux jouer avec moi ? Oui (1) / Non (2).");
        String choice = scanner.next();
        if (choice.equals("1") || choice.equals("2")) {
            if (choice.equals("1")) {
                System.out.println("Que la partie commennnnnce !");
            } else if (choice.equals("2")) {
                System.out.println("Tu quittes la partie...");
            }
        } else {
            beginGame(scanner);
        }

        Game gameOne = new Game();
        Board plateau = new Board();
        Player joueurUn = new Player("X");
        Player joueurDeux = new Player("O");

//        while (!plateau.isBoardFull()) {
            gameOne.interaction(joueurUn, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurDeux, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurUn, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurDeux, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurUn, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurDeux, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurUn, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurDeux, plateau, gameOne.chooseCase(scanner));
            gameOne.interaction(joueurUn, plateau, gameOne.chooseCase(scanner));
//        }
    }

    }


