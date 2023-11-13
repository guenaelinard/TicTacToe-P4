public class Case {
    private int value;

    public Case() {

    }

    public String defineCase(int value) {
        if (value == 0) {
            return " ";
        } else if (value == 1) {
            return "X";
        } else if (value == 2) {
            return "O";
        } else {
            System.out.println("Attention, la case ne sait pas ce qu'elle est !");
            return null;
        }
    }
}
