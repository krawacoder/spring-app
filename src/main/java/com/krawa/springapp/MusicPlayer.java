package com.krawa.springapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

  //  private List<Music> musicList = new ArrayList<>();
  private ClassicalMusic classicalMusic;
  private RockMusic rockMusic;
  private JazzMusic jazzMusic;

  private String name;
  private int volume;

  @Autowired
  public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic,
      JazzMusic jazzMusic) {
    this.classicalMusic = classicalMusic;
    this.rockMusic = rockMusic;
    this.jazzMusic = jazzMusic;
  }

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

//  public List<Music> getMusicList() {
//    return musicList;
//  }
//
//  public void setMusicList(List<Music> musicList) {
//    this.musicList = musicList;
//  }

  public void playMusic() {
    System.out.println(classicalMusic.getSong());
    System.out.println(rockMusic.getSong());
    System.out.println(jazzMusic.getSong());
  }
//  public void playMusic() {
//    for (Music song : musicList) {
//      System.out.println("Playing: " + song.getSong());
//    }
//  }
}
