package com.adapter.twowayadapter;

//Concrete Implementation 2
public class VideoPlayer implements AdvancedMediaPlayer {
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file: " + fileName);
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file: " + fileName);
	}
}