package com.command.texteditor;

//Step 5: Client
public class TextEditorDemo {
 public static void main(String[] args) {
     TextEditor editor = new TextEditor();
     CommandManager manager = new CommandManager();

     manager.executeCommand(new AddTextCommand(editor, "Hello "));
     manager.executeCommand(new AddTextCommand(editor, "World!"));

     System.out.println("\n📄 Current text: " + editor.getText());

     manager.undoStack();
     System.out.println("📄 After undo: " + editor.getText());

     manager.redoStack();
     System.out.println("📄 After redo: " + editor.getText());
 }
}