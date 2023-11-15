import players.Player;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private final Case board[][] = new Case[3][3];
    Scanner scanner = new Scanner(System.in);

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
                getCaseFromNum(caseNum).setValue(value);

        } else {

            playAgainSameCase();
        }
    }

    public void playAgainSameCase() {
        System.out.println("la case a déjà été jouée, choisis une autre case.");
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

    public boolean isntBoardFull() {
for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(board[i][j].getValue().equals(" ")) return true;
        }
    }
    return false;
    }

    public boolean isHorizontallyAligned(Player perso) {
            for(int j = 0; j < 3; j++){
                if(board[0][j].getValue().equals(perso.getAttribute()) && board[0][j].getValue().equals(board[1][j].getValue()) &&
                        board[0][j].getValue().equals(board[2][j].getValue())) {
                    return true;
                }
            }
        return false;
    }

    public boolean isVerticallyAligned(Player perso) {
        for(int i = 0; i < 3; i++){
                if(board[i][0].getValue().equals(perso.getAttribute()) && board[i][0].getValue().equals(board[i][1].getValue()) &&
                        board[i][0].getValue().equals(board[i][2].getValue())) {
                    return true;
                }
        }
        return false;
    }

    public boolean isFirstDiagonallyAligned(Player perso) {
            if(board[0][0].getValue().equals(perso.getAttribute()) && board[0][0].getValue().equals(board[1][1].getValue()) &&
                    board[0][0].getValue().equals(board[2][2].getValue())) {
                return true;
            }
            return false;
    }

    public boolean isSecondDiagonallyAligned(Player perso) {
        if(board[3][0].getValue().equals(perso.getAttribute()) && board[3][0].getValue().equals(board[2][2].getValue()) &&
                board[3][0].getValue().equals(board[0][3].getValue())) {
            return true;
        }
        return false;
    }

    public boolean hasWon(Player perso) {
        if (isHorizontallyAligned(perso) || isVerticallyAligned(perso) || isFirstDiagonallyAligned(perso) || isSecondDiagonallyAligned(perso)) {
            System.out.println(perso + " et gagne !");
            return true;
        }
        return false;
    }

}


