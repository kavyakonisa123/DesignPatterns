package com.command.homeautomation;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.volume(10);
	}

	@Override
	public void undo() {
		stereo.off();

	}

}
