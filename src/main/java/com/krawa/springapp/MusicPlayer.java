package com.krawa.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
  private List<Music> musicList = new ArrayList<>();

  private String name;
  private int volume;

//  public MusicPlayer(List<Music> music) {
//    this.music = music;
//  }

  public MusicPlayer(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public List<Music> getMusicList() {
    return musicList;
  }

  public void setMusicList(List<Music> musicList) {
    this.musicList = musicList;
  }

  public void playMusic() {
    for (Music song : musicList) {
      System.out.println("Playing: " + song.getSong());
    }
  }
}
