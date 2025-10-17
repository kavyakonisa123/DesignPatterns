package com.command.homeautomation;

public class TelevisionOnCommand  implements Command {
	Television television;

	public TelevisionOnCommand(Television television) {
		this.television=television;
	}

	@Override
	public void execute() {
		television.on();
	}

	@Override
	public void undo() {
		television.off();

	}
}
