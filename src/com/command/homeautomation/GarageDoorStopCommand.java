package com.command.homeautomation;

public class GarageDoorStopCommand implements Command {
	GarageDoor garageDoor;
	int prevStatus;

	public GarageDoorStopCommand(GarageDoor garageDoor) {
		this.garageDoor=garageDoor;
	}

	@Override
	public void execute() {
		prevStatus= garageDoor.getStatus();
		garageDoor.stop();
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