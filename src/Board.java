import players.Player;

import java.util.Arrays;

public class Board {
    private final Case[][] board = new Case[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Case("0");
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

    public Case defineCase(Case caseChoice, String value) {
        if (value.equals("0")) {
            caseChoice = new Case(" ");
        } else if (value.equals("X")) {
            caseChoice = new Case("X");
        } else if (value.equals("O")) {
            caseChoice = new Case("O");
        } else {
            System.out.println("Attention, la case ne sait pas ce qu'elle est !");
            caseChoice = null;
        }
        return caseChoice;
    }

    public void caseTick(Player player, Case caseChoice) {
            defineCase(caseChoice, player.getAttribute());
        }

//    @Override
//    public String toString() {
//        return Arrays.toString(board);
//    }
}


