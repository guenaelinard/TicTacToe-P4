public class Case {
    private String value;

    public Case(String value) {
        this.value = value;
    }

    public boolean isCaseEmpty() {
        return this.getValue().equals(" ");
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
