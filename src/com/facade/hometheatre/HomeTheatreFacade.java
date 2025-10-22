package com.facade.hometheatre;

public class HomeTheatreFacade {
	Amplifier amp;
	Tuner tuner;
	Projector projector;
	TheatreLights lights;
	Screen screen;
	PopcornPopper popper;
	StreamingPlayer player;

	
	public HomeTheatreFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector,
			TheatreLights lights, Screen screen, PopcornPopper popper) {
		super();
		this.amp = amp;
		this.tuner = tuner;
		this.player = player;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMovie(String movie) {
		  System.out.println("Get ready to watch the movie" + movie);

		  popper.on();
		  popper.pop();
		  lights.off();
		  lights.dim(11);
		  screen.down();
		  projector.on();
		  projector.wideScreenMode();
		  amp.on();
		  amp.setStreamingPlayer(player);
		  amp.setSurroundSound();
		  amp.setVolume(10);
		  player.on();
		  player.play(movie);
	}
	
	public void endMovie() {
		  System.out.println("Thank you for watching the movie");

		  popper.off();
		  lights.on();
		  screen.up();
		  projector.off();
		  amp.off();
		  player.stop();
		  player.off();
	}
	
	 public void listenToRadio(int frequency) {
		  System.out.println("Tuning to Radio...");
		  tuner.on();
		  tuner.setFrequency(frequency);
		  amp.on();
		  amp.setVolume(5);
		  amp.setTuner(tuner);
		 }

		 public void endRadio() {
		  System.out.println("Shutting down the tuner...");
		  tuner.off();
		  amp.off();
		 }
	
	
	

}
