import java.util.Scanner;

public class Game {
    private Board board = new Board();
    private PlayerOne playerOne = new PlayerOne();
    private PlayerTwo playerTwo = new PlayerTwo();


    public String chooseCase(Scanner scanner) {
        System.out.println("Choisis une case.");
        String caseNum = scanner.next();
        return caseNum;
    }
    public void interaction(Player player, Board board, String caseNum) {
        board.caseTick(player, board.getCaseFromNum(caseNum));
    }


}
