package com.adapter.twowayadapter;

public class MusicStation {
	public static void main(String[] args) {
		MediaPlayer mp3Player = new AudioPlayer();
		AdvancedMediaPlayer mp4Player = new VideoPlayer();

		// Using Advanced player in Media context
		MediaPlayer adapter1 = new TwoWayMediaAdapter(mp4Player);
		adapter1.play("song.mp4");

		// Using Audio player in Advanced context
		AdvancedMediaPlayer adapter2 = new TwoWayMediaAdapter(mp3Player);
		adapter2.playMp4("classic.mp3");
		adapter2.playVlc("retro.mp3");
	}
}