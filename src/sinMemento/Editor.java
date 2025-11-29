package sinMemento;
public class Editor {

    private String text;
    private int cursor;

    public Editor() {
        this.text = "";
        this.cursor = 0;
    }

    // Escribir texto al final
    public void write(String newText) {
        this.text += newText;
        this.cursor = text.length();
    }

    // Eliminar los últimos N caracteres
    public void deleteLast(int count) {
        if (count <= 0 || count > text.length()) return;
        this.text = this.text.substring(0, text.length() - count);
        this.cursor = text.length();
    }

    // Mover el cursor a una posición específica
    public void setCursor(int position) {
        if (position < 0) position = 0;
        if (position > text.length()) position = text.length();
        this.cursor = position;
    }

    public String getText() {
        return this.text;
    }

    public int getCursor() {
        return this.cursor;
    }
    
    // Método main para probar la clase Editor
    public static void main(String[] args) {
        Editor editor = new Editor();
        System.out.println("----APLICATIVO DE EDITOR SIN MEMENTO----");

        System.out.println("Texto inicial: '" + editor.getText() + "', Cursor: " + editor.getCursor());

        editor.write("Hola mundo");
        System.out.println("Después de escribir: '" + editor.getText() + "', Cursor: " + editor.getCursor());

        editor.setCursor(5);
        System.out.println("Cursor movido a posición 5: " + editor.getCursor());

        editor.deleteLast(6);
        System.out.println("Después de borrar 6 caracteres: '" + editor.getText() + "', Cursor: " + editor.getCursor());
    }
}
