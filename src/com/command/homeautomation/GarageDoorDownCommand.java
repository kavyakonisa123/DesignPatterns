package com.command.homeautomation;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;
	int prevStatus;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor=garageDoor;
	}

	@Override
	public void execute() {
		prevStatus= garageDoor.getStatus();
		garageDoor.down();
	}

	@Override
	public void undo() {
		if(prevStatus == GarageDoor.UP) {
			garageDoor.up();
		} else if(prevStatus == GarageDoor.DOWN) {
			garageDoor.down();
		} else if(prevStatus == GarageDoor.OFF) {
			garageDoor.lightOff();
		} else if(prevStatus == GarageDoor.ON) {
			garageDoor.lightOn();
		} else if(prevStatus == GarageDoor.STOP) {
			garageDoor.stop();
		}

	}

}
