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
            } else {
                System.out.println("Tu quittes la partie...");
                System.exit(0);
            }
        } else {
            beginGame(scanner);
        }

    }

}


