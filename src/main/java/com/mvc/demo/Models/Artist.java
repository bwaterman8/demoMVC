package com.mvc.demo.Models;

import java.util.Set;

public class Artist {
    private String name;
    private int age;
    private String origin;
    private Set<Album> albums;

    public Artist() {
    }

    public Artist(String name, int age, String origin, Set<Album> albums) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
}
