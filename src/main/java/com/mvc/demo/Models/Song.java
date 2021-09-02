package com.mvc.demo.Models;

import java.util.Set;

public class Song {
    private String title;
    private int length;
    private Set<Album> albums;
    private Set<Artist> artists;

    public Song() {
    }

    public Song(String title, int length, Set<Album> albums, Set<Artist> artists) {
        this.title = title;
        this.length = length;
        this.albums = albums;
        this.artists = artists;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }
}
