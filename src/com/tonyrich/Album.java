package com.tonyrich;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class Album implements Playable {
    public Album(String name, String genre, String art) {
        this.name = name;
        this.genre = genre;
        this.art = art;
        this.songs = new ArrayList<Song>();
    }

    private String name;
    private String genre;
    private String art;
    private ArrayList<Song> songs;

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }


    @Override
    public void play() {
        System.out.println("this song is: " + this.name + " " + this.songs + "for " + this.art + "artist");
    }

    public void addSong(Song s) {
        this.songs.add(s);
    }

    public void deleteSong(String songName) {

        for (Song s: this.songs){
                if (s.getName().equals(songName)) {
                    songs.remove(s);
                    break;
            }
        }
    }

    public int getTotalDuration(){
        int total=0;
        for (Song s: this.songs){
             total += s.getDuration();
        }
        return total;
    }

    }
