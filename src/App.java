import conMemento.Caretaker;
import conMemento.Originator;

public class App {
    public static void main(String[] args) {

        Originator editor = new Originator();
        Caretaker caretaker = new Caretaker(editor);
        System.out.println("----APLICACION DEL PATRON MEMENTO----");

        System.out.println("Texto inicial: '" + editor.getText() + "', Cursor: " + editor.getCursor());
        caretaker.save();
        
        editor.write("Hola mundo");
        System.out.println("\nDespués de escribir: '" + editor.getText() + "', Cursor: " + editor.getCursor());
        caretaker.save();
        editor.setCursor(5);
        
        System.out.println("Cursor movido a posición 5: " + editor.getCursor());
        caretaker.save();
        editor.deleteLast(6);
        
        System.out.println("Después de borrar 6 caracteres: '" + editor.getText() + "', Cursor: " + editor.getCursor());
        caretaker.undo();
        
        System.out.println("Después de deshacer: '" + editor.getText() + "', Cursor: " + editor.getCursor());
        caretaker.redo();
        System.out.println("Después de rehacer: '" + editor.getText() + "', Cursor: " + editor.getCursor());

    }
}
