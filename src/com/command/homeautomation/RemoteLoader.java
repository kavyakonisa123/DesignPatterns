package com.command.homeautomation;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenRoomLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("LIving Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

//		remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
//		remoteControl.setCommand(1, () -> kitchenRoomLight.on(), () -> kitchenRoomLight.off());
//		remoteControl.setCommand(2, () -> garageDoor.up(), () -> garageDoor.down());
//		remoteControl.setCommand(3, () -> stereo.on(), () -> stereo.off());
//
		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

	}

}
