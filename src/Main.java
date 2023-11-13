import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zéééépartiiii!");
        Menu menu = new Menu();
        menu.beginGame(scanner);

        Game gameOne = new Game();
        gameOne.chooseCase(scanner);

    }
}