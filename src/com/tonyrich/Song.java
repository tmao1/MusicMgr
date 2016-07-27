package com.tonyrich;

/**
 * Created by localadmin on 7/27/16.
 */
public class Song implements Playable{

    private String name;
    private String lyrics;
    private  short duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    public Song(String name, String lyrics, short duration) {
        this.name = name;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("this song is: " + this.name + " " + this.lyrics + "for "+this.duration +"minutes");

    }
}
