package com.command.texteditor;

import java.util.Stack;

//Step 4: Invoker - Command Manager (Handles undo/redo stacks)
class CommandManager {
	private Stack<TextCommand> undoStack = new Stack<>();
	private Stack<TextCommand> redoStack = new Stack<>();

	public void executeCommand(TextCommand command) {
		command.execute();
		undoStack.push(command);
		redoStack.clear(); // Clear redo stack when new command is executed
	}

	//When undo is called, the last command is popped and its undo() method reverses the effect.
	public void undoStack() {
		if (!undoStack.isEmpty()) {
			TextCommand command = undoStack.pop();
			command.undo();
			redoStack.push(command);
			System.out.println("↩️ Undo performed");
		} else {
			System.out.println("⚠️ Nothing to undo.");
		}
	}
  
	//	When redo is called, the command is re-executed and moved back to the undo stack.
	public void redoStack() {
		if (!redoStack.isEmpty()) {
			TextCommand command = redoStack.pop();
			command.execute();
			undoStack.push(command);
			System.out.println("🔁 Redo performed");
		} else {
			System.out.println("⚠️ Nothing to redo.");
		}
	}
}
