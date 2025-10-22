package com.facade.hometheatre;

public class HomeTheatreKit {
	 public static void main(String[] args) {
		  Amplifier amp = new Amplifier("Amplifier");
		  Tuner tuner = new Tuner(amp, "AM/FM Tuner");
		  StreamingPlayer player = new StreamingPlayer("Streaming Player Player", amp);
		  Projector projector = new Projector(player,"Projector");
		  TheatreLights lights = new TheatreLights();
		  Screen screen = new Screen();
		  PopcornPopper popper = new PopcornPopper();
			
		 HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amp, tuner,player,projector,lights, screen,popper);
		 System.out.println("---------MovieNight------------");
		 homeTheatreFacade.watchMovie("Spider Man");
		 homeTheatreFacade.endMovie();
		 
		 System.out.println("---------Radio Day------------");

		 homeTheatreFacade.listenToRadio(10);
		 homeTheatreFacade.endRadio();
	 }

}
