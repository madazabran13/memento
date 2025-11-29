package conMemento;

public class Memento {

    private final String text;
    private final int cursor;

    public Memento(String text, int cursor) {
        this.text = text;
        this.cursor = cursor;
    }

    public String getText() {
        return text;
    }

    public int getCursor() {
        return cursor;
    }
}
