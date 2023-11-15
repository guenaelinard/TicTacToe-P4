import players.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game gameOne = new Game(new Board(), new Player("X"));
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zéééépartiiii!");

        menu.beginGame(scanner);
        gameOne.runGame(scanner);

    }
}