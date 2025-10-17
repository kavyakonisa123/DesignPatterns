package com.command.homeautomation;

public class RemoteLoaderWithUndo {

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
			CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
			CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
			CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

			GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
			GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

			StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
			StereoOffCommand stereoOff = new StereoOffCommand(stereo);

			remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
			remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
			remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
			remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

			remoteControl.setCommand(4, ceilingFanOn, ceilingFanOff);
			remoteControl.setCommand(5, ceilingFanMedium, ceilingFanOff);
			remoteControl.setCommand(6, ceilingFanLow, ceilingFanOff);



			remoteControl.onButtonWasPushed(0);
			remoteControl.offButtonWasPushed(0);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();


			remoteControl.onButtonWasPushed(1);
			remoteControl.offButtonWasPushed(1);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();

			remoteControl.offButtonWasPushed(1);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();
			System.out.println("--------ceiling Fan 1-------------------");


			remoteControl.onButtonWasPushed(4);
			remoteControl.offButtonWasPushed(4);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();

			System.out.println("--------ceiling Fan 2-------------------");

			remoteControl.onButtonWasPushed(5);
			remoteControl.offButtonWasPushed(5);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();

			System.out.println("--------ceiling Fan3-------------------");

			remoteControl.onButtonWasPushed(6);
			System.out.println(remoteControl);
			remoteControl.undoButtonWasPushed();




		}



}
