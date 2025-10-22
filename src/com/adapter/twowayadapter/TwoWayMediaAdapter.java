package com.adapter.twowayadapter;

//Two-Way Adapter
public class TwoWayMediaAdapter implements MediaPlayer, AdvancedMediaPlayer {
    private MediaPlayer audioPlayer;
    private AdvancedMediaPlayer videoPlayer;

    public TwoWayMediaAdapter(MediaPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public TwoWayMediaAdapter(AdvancedMediaPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    // As MediaPlayer (adapting AdvancedMediaPlayer)
    public void play(String fileName) {
        if (videoPlayer != null) {
            System.out.println("Two-way adapter using AdvancedMediaPlayer...");
            videoPlayer.playMp4(fileName);
        } else if (audioPlayer != null) {
            audioPlayer.play(fileName);
        }
    }

    // As AdvancedMediaPlayer (adapting MediaPlayer)
    public void playVlc(String fileName) {
        System.out.println("Two-way adapter adapting MediaPlayer to play vlc: " + fileName);
        if (audioPlayer != null) {
            audioPlayer.play(fileName);
        }
    }

    public void playMp4(String fileName) {
        System.out.println("Two-way adapter adapting MediaPlayer to play mp4: " + fileName);
        if (audioPlayer != null) {
            audioPlayer.play(fileName);
        }
    }
}