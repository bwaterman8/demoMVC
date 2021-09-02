package com.mvc.demo.Models;

import java.util.Set;

public class Album {
    private String title;
    private Set<Song> songs;
    private Set<Artist> artists;

    public Album() {
    }

    public Album(String title, Set<Song> songs, Set<Artist> artists) {
        this.title = title;
        this.songs = songs;
        this.artists = artists;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }
}
