package com.mvc.djview;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;

public class BeatModel implements BeatModelInterface, Runnable{

	List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	int bpm= 100;
	Thread thread;
	boolean stop= false;
	Clip clip;
	

	public void initialize() {
	    try {
	        URL resource = getClass().getResource("/clap.wav");
	        System.out.println("FOUND RESOURCE = " + resource);

	        if (resource == null) {
	            throw new RuntimeException("Audio resource not found!");
	        }

	        AudioInputStream ais = AudioSystem.getAudioInputStream(resource);
	        clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
	        clip.open(ais);

	    } catch (Exception e) {
	        System.out.println("ERROR: clap.wav not found or cannot be loaded!");
	        e.printStackTrace();
	    }
	}



	@Override
	public void on() {
		bpm=100;
		notifyBPMObservers();
		thread= new Thread(this);
		stop=false;
		thread.start();
		
		
	}

	

	@Override
	public void off() {
		stopBeat();
		stop=true;
		
	}
	
	

	@Override
	public void run() {
		while(!stop) {
			playBeat();
			notifyBeatObservers();
			try {
				Thread.sleep(6000/getBPM());
			}
			catch(Exception e) {}

		}
		
	}

	

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		notifyBPMObservers();
		
	}

	@Override
	public int getBPM() {
		return bpm;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
		
	}

	@Override
	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if(i>=0) beatObservers.remove(i);
		
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
		
	}

	@Override
	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if(i>=0) bpmObservers.remove(i);
		
	}
	
	private void notifyBeatObservers() {
		for(int i=0; i< beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
		
	}
	private void notifyBPMObservers() {
		for(int i=0; i< bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}
	
	private void playBeat() {
		clip.setFramePosition(0);
		clip.start();
		
	}
	private void stopBeat() {
		clip.setFramePosition(0);
		clip.stop();
		
	}

}
