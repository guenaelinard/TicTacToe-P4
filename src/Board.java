import java.util.ArrayList;

public class Board {
    private final Case[][] board = new Case[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Case(0);
            }
        }
    }

    public Case getCaseFromNum(String caseNum) {
        return switch (caseNum) {
            case "7" -> board[0][0];
            case "8" -> board[0][1];
            case "9" -> board[0][2];
            case "4" -> board[1][0];
            case "5" -> board[1][1];
            case "6" -> board[1][2];
            case "1" -> board[2][0];
            case "2" -> board[2][1];
            case "3" -> board[2][2];
            default -> null;
        };
    }

    public void caseTick(Player player, Case caseChoice) {
        if (player.getAttribute() == 1) {
            caseChoice.defineCase(1);
        } else {
            caseChoice.defineCase(2);
        }
    }

}
