package conMemento;

public class Originator {

    private String text = "";
    private int cursor = 0;

    public void write(String s) {
        text += s;
        cursor = text.length();
    }

    public void deleteLast(int n) {
        if (n <= 0) return;
        int newLen = Math.max(0, text.length() - n);
        text = text.substring(0, newLen);
        cursor = text.length();
    }

    public void setCursor(int pos) {
        if (pos < 0) pos = 0;
        if (pos > text.length()) pos = text.length();
        this.cursor = pos;
    }

    public String getText() {
        return text;
    }

    public int getCursor() {
        return cursor;
    }

    // Crear snapshot
    public Memento saveState() {
        return new Memento(text, cursor);
    }

    // Restaurar snapshot
    public void restore(Memento memento) {
        this.text = memento.getText();
        this.cursor = memento.getCursor();
    }
}
