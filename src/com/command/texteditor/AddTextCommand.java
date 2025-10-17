package com.command.texteditor;

// Step 3: Concrete Commands
class AddTextCommand implements TextCommand {
	private TextEditor editor;
	private String textToAdd;

	public AddTextCommand(TextEditor editor, String textToAdd) {
		this.editor = editor;
		this.textToAdd = textToAdd;
	}

	@Override
	public void execute() {
		editor.addText(textToAdd);
	}

	@Override
	public void undo() {
		editor.deleteLast(textToAdd.length());
	}
}
