package com.command.homeautomation;

public class RemoteLoaderMacro {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Television television = new Television("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		TelevisionOnCommand televisionOn = new TelevisionOnCommand(television);
		TelevisionOffCommand televisionOff = new TelevisionOffCommand(television);
		
		Command[] partyOn = {livingRoomLightOn,stereoOnWithCD,televisionOn};
		Command[] partyOff = {livingRoomLightOff,stereoOff ,televisionOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		System.out.println("Pushing Macro On------------");

		remoteControl.onButtonWasPushed(0);
		System.out.println("Pushing Macro Off------------");

		remoteControl.offButtonWasPushed(0);
		System.out.println("Pushing Macro Undo------------");
		remoteControl.undoButtonWasPushed();


		


}
}
