import players.Player;

import java.util.Arrays;

public class Board {
    private final Case board[][] = new Case[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Case(" ");
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

    public void defineCase(String caseNum, String value) {

        if (getCaseFromNum(caseNum).isCaseEmpty()) {
            if (value.equals("X")) {
                getCaseFromNum(caseNum).setValue("X");
            } else if (value.equals("O")) {
                getCaseFromNum(caseNum).setValue("O");
            } else {
                System.out.println("Attention, la case ne sait pas ce qu'elle est !");
            }
        } else {
            System.out.println("la case a déjà été jouée");
        }
    }

//    public boolean checkCaseEmpty(Case caseX) {
//        return caseX.isCaseEmpty();
//    }

    public void caseTick(Player player, String caseNum) {

            defineCase(caseNum, player.getAttribute());

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
        }
    }

}


