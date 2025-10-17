package com.command.homeautomation;

public class TelevisionOffCommand implements Command {
	Television television;
	
	public TelevisionOffCommand(Television television) {
		this.television=television;
	}

	public void execute() {
		television.off();
	}

	public void undo() {
		television.on();
		
	}
}
