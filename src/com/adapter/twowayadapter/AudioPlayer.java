package com.adapter.twowayadapter;

//concrete Implemetation
public class AudioPlayer implements MediaPlayer {
   
	public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}