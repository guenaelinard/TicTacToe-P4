import java.util.ArrayList;

public class Board {
    private final Case[][] board = new Case[3][3];
    private int position;

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new Case(0);
            }
        }
    }

    public int getCasePosition(String Case[][]) {


        return position;
    }


}
