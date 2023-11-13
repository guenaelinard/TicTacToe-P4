import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        beginGame();
        }

    public void beginGame() {
        System.out.println("Tu veux jouer avec moi ? Oui (1) / Non (2).");
        String choice = scanner.next();
        if (choice.equals("1") || choice.equals("2")) {
            if (choice.equals("1")) {
                System.out.println("Que la partie commennnnnce !");
//                Game gameOne = new Game();
            } else if (choice.equals("2")) {
                System.out.println("Tu quittes la partie...");
            }
        } else {
            beginGame();
        }
    }


    }


