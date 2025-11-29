package conMemento;

import java.util.Stack;

public class Caretaker {

    private Originator originator;
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void save() {
        undoStack.push(originator.saveState());
        redoStack.clear();
    }

    public void undo() {
        if (undoStack.isEmpty()) return;
        redoStack.push(originator.saveState());
        originator.restore(undoStack.pop());
    }

    public void redo() {
        if (redoStack.isEmpty()) return;
        undoStack.push(originator.saveState());
        originator.restore(redoStack.pop());
    }
}
