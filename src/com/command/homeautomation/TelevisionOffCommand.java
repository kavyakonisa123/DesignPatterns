package com.command.homeautomation;

public class TelevisionOffCommand implements Command {
	Television television;

	public TelevisionOffCommand(Television television) {
		this.television=television;
	}

	@Override
	public void execute() {
		television.off();
	}

	@Override
	public void undo() {
		television.on();

	}
}
