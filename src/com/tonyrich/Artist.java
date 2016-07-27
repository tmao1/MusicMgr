package com.tonyrich;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/27/16.
 */
public class Artist {
    private String name;
    private ArrayList<Album> albums = new ArrayList<>();


    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album al){
        albums.add(al);
    }

    public void deleteAlbum(String albumName) {

        for (Album a: this.albums){
            if (a.getName().equals(albumName)) {
                albums.remove(a);
                break;
            }
        }
    }

}
