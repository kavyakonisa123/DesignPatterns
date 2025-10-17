package com.command.homeautomation;

public class TelevisionOnCommand  implements Command {
	Television television;
	
	public TelevisionOnCommand(Television television) {
		this.television=television;
	}

	public void execute() {
		television.on();
	}

	public void undo() {
		television.off();
		
	}
}
